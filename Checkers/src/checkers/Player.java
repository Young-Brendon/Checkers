

package checkers;

/**
 *
 * @author Angela & Brendon
 */
public class Player {
    
    String name = "Player 1";
    String color = "red";
    int wins = 0;
    int losses = 0;
    boolean marker = true;
    
    public Player(){
        
    }
    
    public void displayName() {
        System.out.println("\t\tHello, my name is " + this.name);
    }

    String getPlayerStastics() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
