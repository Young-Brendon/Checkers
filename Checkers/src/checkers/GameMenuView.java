
package checkers;

import java.util.Scanner;
/**
 * @author Angela
 */
public class GameMenuView {   
    
        GameMenuControl gameMenuControl = new GameMenuControl();
        GamePreferencesMenuView gamePreferencesMenuView = new GamePreferencesMenuView();
        GetLocationView getLocationView = new GetLocationView();
        
    private final static String[][] menuItems = {
        {"T", "Take your turn"},
        {"D", "Display the board"},
        {"N", "New Game"},
        {"R", "Report stastics"},
        {"P", "Change game preferences"},
        {"A", "Add list of players names"},
        {"H", "Help"},
        {"Q", "QUIT"}
    };

    public GameMenuView() {        
                
    }   
    
    public void getInput() {
   
        String command;
        Scanner inFile = new Scanner(System.in);

        do {
            this.display(); // display the menu

            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "T":
                    System.out.println("Take a turn");
                    getLocationView.getInput();
                    //this.gameMenuControl.takeTurn();
                    break;
                case "D":                    
                    gameMenuControl.displayBoard();
                    break;
                case "N":
                    System.out.println("Start a new game");
                    
                    //gameMenuControl.startNewGame();
                    break;
                case "R":                    
                    gameMenuControl.displayStatistics();
                    break;
                case "P":
                    gamePreferencesMenuView.getInput();
                    break;
                case "A":
                    gameMenuControl.displayPlayers();
                    break;
                case "H":
                    gameMenuControl.displayHelpMenu();
                    break;
                case "Q":
                    break;
                default:
                    new CheckersError().displayError("Invalid command. Please enter a valid command.");
                    continue;
            }
        } while (!command.equals("Q"));

        return;
    }
    


    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < GameMenuView.menuItems.length; i++) {
            System.out.println("\t " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
  
}    

