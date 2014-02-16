package checkers;

import java.util.Scanner;
/**
 * @author Angela
 */
public class GetMarkerView {
    private Game game;
    
    /*
* default constructor
*/
    public GetMarkerView(Game game) {
        this.game = game;
        
    }
    
    public String getInput(Player player) {

        String newMarker = null;
        Scanner in = new Scanner(System.in);
                
        boolean valid = false; // flag to indicate if valid character entered
        while (!valid) {
            // prompt for input
            System.out.println("\n\t" + player.name
                    + "\n\t, enter 'R' for red or 'B' for black that will be"
                    + "\n\t used to mark your squares in the game.");
            
            // get input from user
            newMarker = in.nextLine();
           
            // no marker entered?
            if (newMarker == null || newMarker.length() < 1) {
                continue;
            }
            
            // grab only the first character and convert it to upper case
            newMarker = newMarker.substring(0, 1).toUpperCase();
            
            if (newMarker.equals("Q")) { // Quit?
                return null;
            }
            
            // entry other than R or B?
            if ((newMarker != "R") || (newMarker != "B")) {
                System.out.println("\n\tInvalid Entry. Please enter 'R' or 'B'");
            }
                            
            valid = true; // signal that a valid marker was entered
        }
        
        return newMarker;
    }
    
}    
