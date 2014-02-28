
package checkers;

import java.awt.Point;

/**
  * @author Angela
 */
public class GameMenuControl {
      
    private Game game;            
    private Board board;
    private GetLocationView getLocationView;
    BoardView boardView = new BoardView();
    HelpMenuView helpMenuView = new HelpMenuView();
    
    public GameMenuControl(Game game) {
        
        this.game = game;       
    }
    
    public void takeTurn(){
        
        
        boardView.displayBoard();
        boardView.selectPiece();
    }
    
    public void displayBoard() {
        
        boardView.displayBoard();
    }
    
    public void startNewGame() {        
        
        boardView.displayBoard();
    }
     
    public void displayHelpMenu() {
        
        helpMenuView.getInput();
    }
    
    private boolean gameOver(Player player) {
        
            this.game.status = Game.WINNER;
            this.displayGameOverMessage(player, "Congratulations! You won the game.");
            
            return true;
    }
    
    private void displayGameOverMessage(Player player, String message) {
        System.out.println("\n\t************************************************");
        System.out.println("\t " + player.name + ": " + message);
        System.out.println("\t************************************************");
    }

    private int regularPlayerTurn(Player player) {
        
        if (!this.game.status.equals(Game.NEW_GAME) && !this.game.status.equals(Game.PLAYING)) {
            new CheckersError().displayError(
                    "There is no active game. You must start a new game before "
                    + "you can take a turn");
            return -1;
        } 
        
        this.game.status = Game.PLAYING;
        
        GetLocationView getLocationView = new GetLocationView(this.game);
        Point location = getLocationView.getInput();
        if (location == null) { // no location was entered?
            return -1;
        }
            
        this.game.board.occupyLocation(player, location.x, location.y);
        
        return 0;
    }
    
    public void alternatePlayers() {
        if (this.game.currentPlayer == this.game.playerA) {
            this.game.currentPlayer =  this.game.playerB ;
            this.game.otherPlayer =  this.game.playerA;
        } else {
            this.game.currentPlayer =  this.game.playerA;
            this.game.otherPlayer =  this.game.playerB ;
        }
    }
    
    public void clearTheBoard() {
        Player[][] locations = this.game.board.getBoardLocations();
        
        for (int i = 0; i < this.board.getBoardLocations().length; i++) {
            Player[] rowlocations = locations[i];
            for (int j = 0; j < rowlocations.length; j++) {
                rowlocations[j] = null;
            }
        }
    } 
}
