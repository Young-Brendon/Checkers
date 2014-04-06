
package byui.cit260.checkers.controls;

import byui.cit260.checkers.enums.ErrorType;
import byui.cit260.checkers.enums.HelpType;
import byui.cit260.checkers.enums.HelpType;
import byui.cit260.checkers.exceptions.CheckersException;



/**
 *
 * @author Cody
 */
public class HelpMenuControl {
    
    public String getHelpText(HelpType command) throws CheckersException {
        String helpText = "";
        switch (command) {
  
            case BOARD:
            case MARKER:
                helpText = command.getHelpText();
                break;
            default:
                throw new CheckersException(ErrorType.ERROR105.getMessage());
        }

        return helpText;
    }
    
}  

