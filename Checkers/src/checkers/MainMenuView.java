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
    
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < MainMenuView.menuItems.length; i++) {
            System.out.println("\t " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
    
    private boolean validCommand(String command) {
        String[][] items = MainMenuView.menuItems;

        for (String[] item : MainMenuView.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }
    
    protected final String getCommand() {

        Scanner inFile = Checkers.getInputFile();
        String command;
        boolean valid = false;
        do {
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            valid = validCommand(command);
            if (!validCommand(command)) {
                new CheckersError().displayError("Invalid command. Please enter a valid command.");
                continue;
            }
                
        } while (!valid);
        
        return command;
    }
    
    public String getInput(Object object) {
        
        String gameStatus = Game.PLAYING;        
        
        do {
            this.display(); // display the menu
            
            String command = this.getCommand();            
            
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
                    return Game.EXIT;               
            }
        } while (!gameStatus.equals(Game.EXIT));

        return Game.EXIT;
    }    
    
   
    
}
