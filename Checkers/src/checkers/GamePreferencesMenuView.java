package checkers;

import java.util.Scanner;

/**
 * * @author Brendon
 */
public class GamePreferencesMenuView {
    
    Board board = new Board();
    GamePreferencesMenuControl gamePreferencesMenuControl = new GamePreferencesMenuControl();
    Marker marker = new Marker();    

    private final static String[][] menuItems = {
        {"1", "Change Marker of the first Player"},
        {"2", "Change Marker of the second Player"},
        {"D", "Change the dimensions of the board"},
        {"Q", "Return to game menu"}
    };   

    public void getInput() {       
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            this.display();

            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "1":
                    marker.displayMarker();
                    break;
                case "2":
                    marker.displayMarker();
                    break;
                case "D":
                    board.getRows();
                    board.getColumns();
                    board.displaySize();
                    board.displayBoardSize();
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

        for (int i = 0; i < GamePreferencesMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
 
}