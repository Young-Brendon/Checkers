
package byui.cit260.checkers.views; 
import byui.cit260.checkers.controls.Checkers;
import byui.cit260.checkers.enums.ErrorType;

import byui.cit260.checkers.models.Game;
import byui.cit260.checkers.interfaces.EnterInfo;
import java.util.Scanner;
import byui.cit260.checkers.enums.StatusType;
/**
 *
 * @author Angela
 */
public class EnterNamesView implements EnterInfo{
     
    private Game game;

    public EnterNamesView(Game game) {
        this.game = game;
    }

    
    
   
    @Override
    public Object getInput(Object object) {
        String playersName = null;

            System.out.println("\n\tFirst player:");
            playersName = (String) this.getName();
            if (playersName == null) {
                return StatusType.QUIT;
            }
            this.game.getPlayerA().setName(playersName);

            System.out.println("\n\tSecond player:");
            playersName = (String) this.getName();
            if (playersName == null) {
                return StatusType.QUIT;
            }
            this.game.getPlayerB().setName(playersName);
        
        return StatusType.CONTINUE;
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
               ErrorType.displayErrorMsg(ErrorType.ERROR107.getMessage());
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
