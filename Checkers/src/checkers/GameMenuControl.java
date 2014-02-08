/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package checkers;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author Angela
 */
public class GameMenuControl {
      
    private Game game;    
    
    Board board = new Board();       
        

    
    public GameMenuControl() {
    }
    
     
    /*
* Take a turn action
*/
    public void takeTurn() {
        
        int returnValue = 1;
        
        if (!this.game.status.equals(Game.NEW_GAME) &&
            !this.game.status.equals(Game.PLAYING)) {
            new CheckersError().displayError("You must start a new game first.");
            return;
        }
        
        else {    // regular player takes turn
            returnValue = this.regularPlayerTurn(this.game.currentPlayer);
            if (returnValue < 0 || this.gameOver(this.game.currentPlayer)) {
                return;
            }
            this.displayBoard();
            this.alternatePlayers(); // alternate players
            
            // other player takes turn
            returnValue = this.regularPlayerTurn(this.game.currentPlayer);
            if (returnValue < 0 || this.gameOver(this.game.currentPlayer)) {
                return;
            }
            this.displayBoard();
            this.alternatePlayers(); // alternate players
        }
  
    }
    
    
    /*
* Display the board acton
*/
    public void displayBoard() {
        
        //board.getRows();
        //board.getColumns();
        board.displaySize();
        board.displayBoardSize();
    }
    
    /*
* Start a new game action
*/
    public void startNewGame() {
        this.game.start();
        this.displayBoard();
    }
  
    
  
    
    /*
* Display statistics action
*/
     public void displayStatistics() {
        
        Statistics statistics = new Statistics();       
        statistics.displayStatistics();
    }
     
     /*
* Display game preferences menu action
*/
    public void displayPreferencesMenu() {
        GamePreferencesMenuView gamePreferenceMenuView = new GamePreferencesMenuView();
        gamePreferenceMenuView.getInput();
    }
    
    
    /*
* Display help menu action
*/
    public void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.getInput();
    }
    
    /*
* determine if the game is over
* @return true - if the game is a win or a tie; otherwise, return false
*/
    private boolean gameOver(Player player) {
        if (this.isWinner()) {
            this.game.status = Game.WINNER;
            this.displayGameOverMessage(player, "Congratulations! You won the game.");
            
            return true;
        }
        else if (this.isTie()) {
            this.game.status = Game.TIE;
            this.displayGameOverMessage(player, "Better luck next time. The game is a tie.");
            return true;
        }
        
        return false;
    }
    
    private void displayGameOverMessage(Player player, String message) {
        System.out.println("\n\t************************************************");
        System.out.println("\t " + player.name + ": " + message);
        System.out.println("\t************************************************");
    }
    
    /*
* A regular player takes a turn
* @parameter player The player taking the turn
*/
    private int regularPlayerTurn(Player player) {
        
        if (!this.game.status.equals(Game.NEW_GAME) &&
            !this.game.status.equals(Game.PLAYING)) {
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
    

    /*
* Alternate players
*/
    public void alternatePlayers() {
        if (this.game.currentPlayer == this.game.playerA) {
            this.game.currentPlayer = this.game.playerB;
            this.game.otherPlayer = this.game.playerA;
        } else {
            this.game.currentPlayer = this.game.playerA;
            this.game.otherPlayer = this.game.playerB;
        }
    }
    




    /*
* Is the game tied? - Needs to be figured out for checkers
*/
//    private boolean isTie() {
        
 //       Location[][] locations = this.board.boardLocations;
        
        // for every row in the table
  //      for (int row = 0; row < locations.length; row++) {
            
  //          Location[] rowLocations = locations[row];
            
            // for every column in the row
  //          for (int col = 0; col < rowLocations.length; col++) {
  //              Location location = rowLocations[col]; // get contents of cell
  //              if (locations[row][col].player == null) { // location not taken yet?
  //                  return false;
 //               }
 //           }
 //       }

 //       return true; // all locations are taken
//    }

    /*
* Is the game won - Needs to be figured out for checkers
*/
 //   private boolean isWinner() {

 //       Location[][] locations = this.board.boardLocations;

        // for every row in the table
  //      for (int row = 0; row < locations.length; row++) {
            
            // get the list of locstaions (columns) in the row
  //          Location[] rowLocations = locations[row];
            
            // for every column in the row
  //          for (int col = 0; col < rowLocations.length; col++) {
                
                // three of the same players markers in a row?
   //             if (threeInARow(row, col, locations)) {
   //                 return true; // three in a row found (a winner)
   //             }
   //         }
   //     }

   //     return false; // no one is a winner yet
  //  }


    /*
* Find a winning location - Applicable?
*/
//    private Point findWinningLocation(Player player) {
 //       Point coordinate = new Point();
 //       Location[][] locations = this.board.boardLocations;
 //       for (int row = 0; row < locations.length; row++) {
 //           Location[] rowLocations = locations[row];
 //           for (int col = 0; col < rowLocations.length; col++) {
 //               Location location = rowLocations[col];
 //               coordinate.setLocation(row, col);

 //               if (rowLocations[col].player != null) { // location is occupied
 //                   continue;
 //               }

                // search for three adjacent horizontally
 //               if ((row < locations.length
 //                       && col < rowLocations.length - 2)
 //                       && (locations[row][col + 1].player == player
 //                       && locations[row][col + 2].player == player)) {
 //                   return coordinate;
 //               } else if ((row < locations.length
//                        && col > 0 && col < rowLocations.length - 1)
 //                       && (locations[row][col - 1].player == player
 //                       && locations[row][col + 1].player == player)) {
  //                  return coordinate;
 //               } else if ((row < locations.length && col > 1)
 //                       && (locations[row][col - 1].player == player
 //                       && locations[row][col - 2].player == player)) {
 //                   return coordinate;
 //               } // search for three adjacent vertically
 //               else if ((row < locations.length - 2
//                        && col < rowLocations.length)
//                        && (locations[row + 1][col].player == player
//                        && locations[row + 2][col].player == player)) {
//                    return coordinate;
//                } else if ((row > 0 && row < locations.length - 1
//                        && col < rowLocations.length)
//                        && (locations[row - 1][col].player == player
 //                       && locations[row + 1][col].player == player)) {
 //                   return coordinate;
 //               } else if ((row > 1 && col < rowLocations.length)
 //                       && (locations[row - 1][col].player == player
 //                       && locations[row - 2][col].player == player)) {
 //                   return coordinate;
 //               } // search for three adjacent diagonally leaning backward
 //               else if ((row < locations.length - 2
 //                       && col < rowLocations.length - 2)
  //                      && (locations[row + 1][col + 1].player == player
  //                      && locations[row + 2][col + 2].player == player)) {
  //                  return coordinate;
  //              } else if ((row > 0 && row < locations.length - 1
  //                      && col > 0 && col < rowLocations.length - 1)
  //                      && (locations[row - 1][col + 1].player == player
  //                      && locations[row + 1][col - 1].player == player)) {
  //                  return coordinate;
  //              } else if ((row > 1 && col > 1)
  //                      && (locations[row - 1][col - 1].player == player
  //                      && locations[row - 2][col - 2].player == player)) {
 //                   return coordinate;
 //               } // search for three adjacent diagonally learning forward
  //              else if ((row < locations.length - 2 && col > 1)
  //                      && (locations[row + 1][col - 1].player == player
  //                      && locations[row + 2][col - 2].player == player)) {
  //                  return coordinate;
  //              } else if ((row > 0 && row < locations.length - 1
  //                      && col > 0 && col < rowLocations.length - 1)
  //                      && (locations[row - 1][col + 1].player == player
  //                      && locations[row + 1][col - 1].player == player)) {
  //                  return coordinate;
 //               } else if ((row > 1 && col < rowLocations.length - 2)
  //                      && (locations[row - 1][col + 1].player == player
  //                      && locations[row - 2][col + 2].player == player)) {
 //                   return coordinate;
 //               }
 //           }
 //       }

 //       return null; // not found
 //   }


    
      /*
* Clear the board action
*/
    public void clearTheBoard() {
        Location[][] locations = this.game.board.boardLocations;
        
        for (int i = 0; i < this.board.boardLocations.length; i++) {
            Location[] rowlocations = locations[i];
            for (int j = 0; j < rowlocations.length; j++) {
                rowlocations[j] = null;
            }
        }
    }

    private boolean isWinner() {
        return false;
    }

    private boolean isTie() {
        return false;
    }

    private static class GetLocationView {

        public GetLocationView() {
        }

        private GetLocationView(Game game) {
        }

        private Point getInput() {
            return null;
        }
    }

    private static class BoardView {

        public BoardView() {
        }

        private void displayBoard(Board board) {
        }
    }
        
}  
