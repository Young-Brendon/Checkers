package checkers;

import java.util.Scanner;
/**
 * * @author Angela
 */
public class MainMenuView {
    
    private static final String[][] menuItems = {
        {"E", "Enter players names"},
        {"S", "Start game"},
        {"H", "Help"},
        {"X", "Exit Checkers"}
    };  
    
    MainMenuControl mainMenuControl = new MainMenuControl();
    
    public MainMenuView() {  
        
        
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
                case "E":
                    mainMenuControl.createPlayerList();
                    break;
                case "S":                   
                    mainMenuControl.startGame(2);
                    break;
                case "H":
                    this.mainMenuControl.displayHelpMenu();
                    break;
                case "X":
                    break;
                default:
                    new CheckersError().displayError("Invalid command. Please enter a valid command.");
                    continue;
            }
        } while (!command.equals("X"));

        return;
    }    
    
   public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < MainMenuView.menuItems.length; i++) {
            System.out.println("\t " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
    
}
