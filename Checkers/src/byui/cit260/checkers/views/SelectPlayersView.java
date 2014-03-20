
package byui.cit260.checkers.views;
import byui.cit260.checkers.controls.Checkers;

import byui.cit260.checkers.enums.ErrorType;
import byui.cit260.checkers.models.Game;
import byui.cit260.checkers.enums.StatusType;

import java.util.Scanner;

/**
 *
 * @author Brendon
 */
public class SelectPlayersView {
    
    private final Game game;
    private final String[] playerNames;

    public SelectPlayersView(Game game) {
        this.game = game;
        playerNames = Checkers.getNameList();
    }
    
    public StatusType selectPlayers(String[] nameList) {
        String playersName;
        
        this.displayNameList(); // display the list of names
        
        System.out.println("\tPlease enter the number of the first player.");
            
            // get first players name
            playersName = this.getName(Checkers.getNameList());
            if (playersName == null) {
                return null;
            }
            this.game.getPlayerA().setName(playersName);

            // get the second players name
            System.out.println("\tPlease enter the number of the second player.");
            playersName = this.getName(Checkers.getNameList());
            if (playersName == null) {
                return null;
            }
            this.game.getPlayerB().setName(playersName);
                
        return StatusType.CONTINUE; 
        }
         

    public String getName(String[] nameList) {

        Scanner inFile = Checkers.getInputFile();
        String name = null;
        boolean valid = false;
        do {
            String strNumber = inFile.nextLine();
            
            if (strNumber.length() < 1) { // was a value entered ?
                  ErrorType.displayErrorMsg(ErrorType.ERROR107.getMessage());
                continue;
            }
            
            strNumber = strNumber.trim(); // trim off all blanks from front and back
            strNumber = strNumber.substring(0, 1); // get only the first character
            
            if (strNumber.toUpperCase().equals("Q")) { // quit?
                return null;
            }
                       
            if (!strNumber.matches("[0-9]+")) { // is the value entered a number?
                 ErrorType.displayErrorMsg(ErrorType.ERROR202.getMessage());
                continue;
            }
            
            int numberSelected = Integer.parseInt(strNumber); // convert string to integer
            
            // is the number outside the range of the list of names
            if (numberSelected < 1 || numberSelected > nameList.length) {
                ErrorType.displayErrorMsg(ErrorType.ERROR202.getMessage());
                continue;
            }
            
            name = nameList[numberSelected-1]; // get the name from the list
            valid = true; // names selected successfully
      
        } while (!valid);
        
        return name;
    }
    
    
    public void displayNameList() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tSelect the players who will be playing the game.");
        System.out.println("\tEnter the number of a player below:");

        for (int i = 0; i < this.playerNames.length; i++) {
            int namePosition = i+1;
            System.out.println("\t " + namePosition + "\t" + playerNames[i]);
        }
        System.out.println("\t===============================================================\n");
    } 

    
}    
