
package checkers;

import java.awt.Point;
import java.util.Scanner;
/**
 * @author Angela
 */
public class GameMenuView {
    
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
        this.gameCommands = new GameMenuControl(game);
        
    }

    public BoardView getDisplayBoard() {
        return displayBoard;
    }

    public void setDisplayBoard(BoardView displayBoard) {
        this.displayBoard = displayBoard;
    }

    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < GameMenuView.menuItems.length; i++) {
            System.out.println("\t " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }

    private boolean validCommand(String command) {
        String[][] items = GameMenuView.menuItems;

        for (String[] item : GameMenuView.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }

    protected final String getCommand() {

        Scanner inFile = Checkers.getInputFile();
        String command;
        boolean valid = false;
        do {
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            valid = validCommand(command);
            if (!validCommand(command)) {
                new CheckersError().displayError("Invalid command. Please enter a valid command.");
                continue;
            }
                
        } while (!valid);
        
        return command;
    }


    
    public Object getInput(Object object) {
        this.game = (Game) object;
        Scanner inFile = Checkers.getInputFile();

     
        String gameStatus = this.game.getStatus();
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
                    this.displayHelp.display();
                    break;
                case "Q":
                    gameStatus = Game.EXIT;
                    break;
            }
        } while (!gameStatus.equals(Game.EXIT));

        return Game.PLAYING;
    }
    
    
   private void takeTurn() {
        String playersMarker;
        Point selectedLocation;

        if (!this.game.getStatus().equals(Game.NEW_GAME) &&
            !this.game.getStatus().equals(Game.PLAYING)) {
            new CheckersError().displayError(
                    "There is no active game. You must start a new game before "
                    + "you can take a turn");
            return;
        }
        Player currentPlayer = this.game.getCurrentPlayer();
        Player otherPlayer = this.game.getOtherPlayer();

        // get location for first player
        selectedLocation = (Point) getLocation.getLocation(this.game);
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
       if (this.game.getStatus().equals(Game.WINNER)) { // a win?
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

