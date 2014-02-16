package checkers;
/**
 * @author Angela & Brendon
 */
public class Player {
    
    public String name;
    public String color;
    public int wins = 0;
    public int losses = 0;
    public int ties = 0;
    public boolean marker = true;
    
    public Player(){
        
    }
    
    public void displayName() {
        System.out.println("\t\tHello, my name is " + this.name);
    }

    String getPlayerStastics() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
