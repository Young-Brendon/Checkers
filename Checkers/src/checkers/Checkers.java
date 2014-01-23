
package checkers;

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
 
    public Checkers(){
    }
   
    public static void main(String[] args) {
        Checkers checkers = new Checkers();
        checkers.display();
        
        Board board = new Board();
        board.displaySize();
        
        Game game = new Game();
        game.displayPlayers();
        
        Location location = new Location();
        location.displayMarker();
       
        Player player = new Player();
        player.displayName();
        
        Marker marker = new Marker();
        marker.displayPiece();
        
    }
    
    private void display() {
        System.out.println(this.welcomeMsg);
    }

    
    
}
