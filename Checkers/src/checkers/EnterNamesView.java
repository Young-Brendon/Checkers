
package checkers;
import java.util.Scanner;
/**
 *
 * @author Angela
 */
public class EnterNamesView {
     
    private Game game;

    public EnterNamesView(Game game) {
        this.game = game;
    }

    
    
   
    public Object getNames(Object object) {
        String playersName = null;

            System.out.println("\n\tFirst player:");
            playersName = (String) this.getName();
            if (playersName == null) {
                return Game.QUIT;
            }
            this.game.getPlayerA().setName(playersName);

            System.out.println("\n\tSecond player:");
            playersName = (String) this.getName();
            if (playersName == null) {
                return Game.QUIT;
            }
            this.game.getPlayerB().setName(playersName);
        
        return Game.CONTINUE;
    }
 

    public Object getName() {
        String strName = null;
        Scanner inFile = Checkers.getInputFile();

        
        boolean valid = false;
        do {
            System.out.println("\tPlease enter the name of the player.");
            strName = inFile.nextLine();
            strName = strName.trim().toUpperCase();
            if (strName.length() < 1) {
                new CheckersError().displayError("You must enter a name or enter a \"Q\" to quit. Try again.");
                return null;
            }
            strName = strName.trim();
            if (strName.equals("Q")) {
                return null;
            }
            
            valid = true;
        } while (!valid);


        return strName;
    }
    
}
