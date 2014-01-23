

package checkers;

/**
 *
 * @author Angela & Brendon
 */
public class Player {
    
    String name;
    String color;
    int wins = 0;
    int losses = 0;
    
    public Player(){
        
    }
    
    public void displayName() {
        System.out.println("\t\tHello, my name is " + this.name);
    }
}
