package byui.cit260.checkers.views;

import byui.cit260.checkers.exceptions.CheckersException;
import byui.cit260.checkers.enums.StatusType;
import byui.cit260.checkers.enums.HelpType;
import byui.cit260.checkers.interfaces.EnterInfo;


/**
** @author Angela
*/
public class HelpMenuView extends Menu implements EnterInfo {    
        
    private final static String[][] menuItems = {
        {"B", "The board"},
        {"G", "The Checkers game"},
        {"L", "A location"},
        {"M", "A marker"},
        {"R", "A regular player"},
        {"Q", "Quit Help"}
    };   
        
    public HelpMenuView() {
        super(HelpMenuView.menuItems);  
    }
    
    @Override
    public Object getInput (Object object)  {
        
            
       StatusType gameStatus = StatusType.PLAYING;
       
        
        do {
            try{
                
            this.display();
            String command = this.getCommand();
                
            switch (command) {
                case "B":
                    this.displayHelp(HelpType.BOARD);
                    break;
                case "G":
                    this.displayHelp(HelpType.GAME);
                    break;
                case "L":
                    this.displayHelp(HelpType.LOCATION);
                    break;
                case "M":
                    this.displayHelp(HelpType.MARKER);
                    break;
                 case "R":
                    this.displayHelp(HelpType.REAL_PLAYER);
                    break;
                case "Q":
                    return StatusType.QUIT;
                
            }
            }
            catch (CheckersException e) {
                System.out.println("\n" + e.getMessage());
            }
        } while (!gameStatus.equals(StatusType.QUIT));
        
         return gameStatus;
    }
    
    private void displayHelp(HelpType helpText) {
        StringBuilder dividerLine = new StringBuilder(80);
        for (int i = 0; i < 80; i++) {
            dividerLine.insert(i, '~');
        }
        System.out.println("\t" + dividerLine.toString());
        System.out.println(helpText.getHelpText());
        System.out.println("\t" + dividerLine.toString());
    }    
    
}

