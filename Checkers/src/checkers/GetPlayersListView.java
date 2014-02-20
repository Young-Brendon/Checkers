
package checkers;

import java.util.Scanner;
/**
 * @author Angela
 */
public class GetPlayersListView {
    
  public String[] listOfPlayerNames = new String[10];
    
    public GetPlayersListView() {
        
    }    
    
    public String[] getInput() {        
        
        Scanner inFile = new Scanner(System.in);
        
        System.out.println("\n\t---------------------------------------------------------------");
        System.out.println("\t Enter a list of names of those who will be playing Checkers. ");
        System.out.println("\t---------------------------------------------------------------");
        
        int playerIndex = 0;
        boolean done = false;
        while (playerIndex < 10 && !done) {
            System.out.println("\tPlease enter the name of a player "
                    + "or enter \"Q\" to quit.");
            String playersName;
            playersName = inFile.nextLine();
            playersName = playersName.trim();

            if (playersName.length() < 1) {
                new CheckersError().displayError("\tA name must be at least "
                        + "one character long. Try again "
                        + "or enter \"Q\" to quit.");
                continue;
            }
            
                   
            if (alreadyInList(listOfPlayerNames, playersName)) {
                new CheckersError().displayError(
                        "That name has already been entered. "
                        + "Try again or enter \"Q\" to quit.");
                continue;
            }

            if (playersName.toUpperCase().equals("Q")) { // quit?
                done = true;
                break;
            }
            
            // add name to list of player names
            this.listOfPlayerNames[playerIndex] = playersName;
            playerIndex++;

        }
        
        String[] newNameList = new String[playerIndex];
        for (int i = 0; i < playerIndex; i++) {
            newNameList[i] = this.listOfPlayerNames[i];
        }
        

        newNameList = this.sortList(newNameList);
        this.displayNameList(newNameList); // display the list of names
        
        return newNameList;
    }
    
    public String[] sortList(String[] names) {
        // Exchange sort function
        String tmpName;
        int j;
        
        for (int i = 0; i < names.length-1; i++) {
            for (j = i + 1; j < names.length; j++) {
                if (names[i].compareToIgnoreCase(names[j]) > 0) {           
            
                    // swap names
                    tmpName = names[i];
                    names[i] = names[j];
                    names[j] = tmpName;                    
                
            }                
        }
    }

        return names;
    }
    
    
        
    private boolean alreadyInList(String[] list, String value) {
        for (String valueInList : list) {
            if (value.equals(valueInList)) {
                return true;
            }
        }
        return false;
    }
    
    
    
    public void displayNameList(String[] names) {
        System.out.println("\n\t===============================================================");
        System.out.println("\tHere is the ist of players in the game");

        for (int i = 0; i < names.length; i++) {
            if (names[i] == null) {
                break;
            }
                
            int namePosition = i+1;
            System.out.println("\t " + namePosition + "\t" + names[i]);
        }
        System.out.println("\t===============================================================\n");
    }
    
    
}
