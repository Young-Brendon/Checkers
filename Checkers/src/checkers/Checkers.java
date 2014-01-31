
package checkers;

import java.util.Scanner;

/**
 *
 * @author Angela and Brendon
 */
public class Checkers {
      String welcomeMsg =
              "\n\t***********************************************************************"
            + "\n\t* Welcome to the game of Checkers!                                    *"
            + "\n\t* You will be playing against a partner. The object of the game       *"
            + "\n\t* is to remove all of your opponents pieces from the board.           *"
            + "\n\t*                                                                     *"
            + "\n\t* Good Luck!!!                                                        *"
            + "\n\t***********************************************************************"
            + "\n";
      String name1;
      String name2;
      String instructions="Each player begins with 12 pieces, either black or red.\n"
             +"The black player moves first. Pieces always move diagonally one space.\n"
             +"A piece may jump over an opponents piece to \"capture\" it. The \n"
             +"captured piece is removed from the board. Multiple capture jumps \n"
             +"are allowed on a single turn. A player wins when the opponenet can not \n"
             +"make any moves or all of the opponents pieces have been removed from \n"
             +"the board."
             + "\n";

    public Checkers(){
    }
   
    public static void main(String[] args) {
             
        Checkers checkers = new Checkers();
        checkers.display();
        checkers.getName();
        checkers.displayHelp();
                       
        Board board = new Board();
        board.getRows();
        board.getColumns();
        board.displaySize();
        board.displayBoardSize();
        
        
        Game game=new Game();
        game.displayPlayers();
        
        Location location = new Location();
        location.displayMarker();
       
        Player player = new Player();
        player.displayName();
        
        Marker marker = new Marker();
        marker.displayMarker();
        marker.getPieces();
        
        Statistics statistics = new Statistics();
        statistics.displayStatistics();
        
    }
    
    private void display() {
        System.out.println(this.welcomeMsg);
    }
    
    public void displayInstructions() {
        System.out.println("Instructions: " + instructions);
    }
    
    private void getName() {
            Scanner input = new Scanner(System.in);
            System.out.println("Player 1 - Enter your name: ");
            this.name1 = input.next();
            System.out.println("Player 2 - Enter your name");
            this.name2 = input.next();
    }
    public void displayHelp(){
        System.out.println("\nWelcome " + name1 + " and " + name2 + "!\n");
        System.out.println("Instructions: " + instructions);
    }
  
}