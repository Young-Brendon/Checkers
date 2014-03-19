
package byui.cit260.checkers.views;

import byui.cit260.checkers.controls.Checkers;
import byui.cit260.checkers.controls.CheckersError;
import byui.cit260.checkers.models.Game;
import byui.cit260.checkers.controls.GameMenuControl;
import byui.cit260.checkers.models.Player;
import byui.cit260.checkers.enums.StatusType;
import byui.cit260.checkers.interfaces.EnterInfo;


import java.awt.Point;
import java.util.Scanner;
/**
 * @author Angela
 */
public class GameMenuView extends Menu implements EnterInfo{
    
    private Game game;
    private GameMenuControl gameCommands ;
    private GetLocationView getLocation = new GetLocationView();
    private BoardView displayBoard = new BoardView();
    private HelpMenuView displayHelp = new HelpMenuView();
    
   
    
    private final static String[][] menuItems = {
        {"T", "Take your turn"},
        {"D", "Display the board"},
        {"N", "New Game"},        
        {"H", "Help"},
        {"Q", "QUIT"}
    };
    

    public GameMenuView(Game game) {
        super(GameMenuView.menuItems);
        this.gameCommands = new GameMenuControl(game);
        
    }

    public BoardView getDisplayBoard() {
        return displayBoard;
    }

    public void setDisplayBoard(BoardView displayBoard) {
        this.displayBoard = displayBoard;
    }

        @Override
    public Object getInput (Object object) {
        this.game = (Game) object;

        StatusType gameStatus = StatusType.CONTINUE;
        do {
     
            this.display();
            
            // get commaned entered
            String command = this.getCommand();
            switch (command) {
                case "T":
                    this.takeTurn();
                    break;
                case "D":
                    this.displayBoard.display(game.getBoard());
                    break;
                case "N":
                    gameCommands.startNewGame(game);
                    this.displayBoard.display(game.getBoard());
                    break;
                case "H":
                    HelpMenuView helpMenu = Checkers.getHelpMenu();
                    helpMenu.getInput(null);
                    break;
                case "Q":
                    gameStatus = StatusType.QUIT;
                    break;
            }
     } while (gameStatus != StatusType.QUIT);

 
        return StatusType.PLAYING;
    }
    
     private void takeTurn() {
        String playersMarker;
        Point selectedLocation;

        if (!this.game.getStatus().equals(StatusType.NEW_GAME) &&
            !this.game.getStatus().equals(StatusType.PLAYING)) {
            new CheckersError().display(
                    "There is no active game. You must start a new game before "
                    + "you can take a turn");
            return;
        }
        Player currentPlayer = this.game.getCurrentPlayer();
        Player otherPlayer = this.game.getOtherPlayer();

        // get location for first player
        selectedLocation = (Point) getLocation.getInput(this.game);
        if (selectedLocation == null) {
            return;
        }

        // regular players turn
        Point locationMarkerPlaced =
                this.gameCommands.playerTakesTurn(currentPlayer, selectedLocation);

        if (this.gameOver()) { // game won or tied?
            return;
        }

        // displayError board and prompt for next player's turn
        this.displayBoard.display(game.getBoard());
        String promptNextPlayer = getNextPlayerMessage(otherPlayer);
        System.out.println("\n\n\t" + promptNextPlayer);


    } 
    
  private boolean gameOver() {
        boolean done = false;
       if (this.game.getStatus().equals(StatusType.WINNER)) { // a win?
            System.out.println("\n\n\t" + this.game.getWinningMessage());
            done = true;
        }
        
        if (done) {
            this.displayBoard.display(this.game.getBoard());
        }
        
        return done;
    }
    
        
   private String getNextPlayerMessage(Player player) {
         return "It is now your turn "
                    + player.getName();
        }
     
}    

