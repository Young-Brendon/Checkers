
package checkers;

/**
 *
 * @author Angela
 */
public class Location {
    int row = 1;
    int column = 1;
    Player player;
    
    public Location() {
        
    }
    
    public void occupyLocation(Player player) {
        this.player=player;
    }
    
    public void displayMarker() {
        if (this.player !=null) {
            System.out.println(this.player.marker);
        }
        else {
            System.out.println(" ");
        }
    }
}
