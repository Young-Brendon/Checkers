
package byui.cit260.checkers.controls;

import byui.cit260.checkers.models.Board;
import byui.cit260.checkers.models.Game;
import byui.cit260.checkers.models.Player;
import java.awt.Point;
import java.util.ArrayList;
import byui.cit260.checkers.enums.StatusType;
import byui.cit260.checkers.enums.ErrorType;


/**
  * @author Angela
 */
public class GameMenuControl {
      
    private Game game;            
    private Board board;
 //   private GetLocationView getLocationView;
 //   BoardView boardView = new BoardView();
 //   HelpMenuView helpMenuView = new HelpMenuView();
    
    public GameMenuControl(Game game) {
        this.game = game;
        this.board = game.getBoard();
    }
           
    public Point playerTakesTurn(Player player, Point selectedLocation) {
        Point locationMarkerPlaced = null;

         if (player == null) {
            ErrorType.displayErrorMsg(ErrorType.ERROR103.getMessage());
            return null;
        }

        if (this.game.getStatus().equals(StatusType.NEW_GAME)) {
            this.game.setStatus(StatusType.PLAYING);
        }
        else if (!this.game.getStatus().equals(StatusType.PLAYING)) {
             ErrorType.displayErrorMsg(ErrorType.ERROR101.getMessage());
        }
        
       
        
        String playerType = player.getPlayerType();

        if (playerType == (Player.REGULAR_PLAYER)) {
            this.regularTurn(player, selectedLocation);
            locationMarkerPlaced = selectedLocation;
        }

        this.alternatePlayers();

        return locationMarkerPlaced;
    }
    
    public void takeTurn(Point selectedLocation) {
        Player currentPlayer = this.game.getCurrentPlayer();
        Player otherPlayer = this.game.getOtherPlayer();
        
        String playerType = currentPlayer.getPlayerType();

            this.playerTakesTurn(currentPlayer, selectedLocation);
            this.alternatePlayers();
        }
        
    
    public void alternatePlayers() {
        if (this.game.getCurrentPlayer() == this.game.getPlayerA()) {
            this.game.setCurrentPlayer(this.game.getPlayerB());
            this.game.setOtherPlayer(this.game.getPlayerA());
        } else {
            this.game.setCurrentPlayer(this.game.getPlayerA());
            this.game.setOtherPlayer(this.game.getPlayerB());
        }
    }
    
    public boolean regularTurn(Player player, Point location){
        if (location == null) {
           ErrorType.displayErrorMsg(ErrorType.ERROR104.getMessage());
            return false;
        }
        
        if (game.getStatus().equals(StatusType.PLAYING) &&
            game.getStatus().equals(StatusType.NEW_GAME)) {
             ErrorType.displayErrorMsg(ErrorType.ERROR101.getMessage());
            return false;
        }

        game.setStatus(StatusType.PLAYING);
        this.markLocation(player, location);
        
        return true;
    }
    
      
    private void markLocation(Player player, Point location) {
 
        this.game.getBoard().occupyLocation(player, location.x, location.y);
        
        this.game.setStatus(StatusType.PLAYING);
    }
    
    
    public void startNewGame(Game game) {
        game.start();
        this.clearTheBoard();
    }
  
    
    
    public void clearTheBoard() {
        Player[][] locations = this.game.getBoard().getBoardLocations();
        
        for (int i = 0; i < this.board.getBoardLocations().length; i++) {
            Player[] rowlocations = locations[i];
            for (int j = 0; j < rowlocations.length; j++) {
                rowlocations[j] = null;
            }
        }
    }
}  
    
    
    
/*    
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
        
        helpMenuView.getInput(null);
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
}*/
