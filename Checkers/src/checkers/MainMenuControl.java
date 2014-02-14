package checkers;

import java.util.Scanner;
/**
 * * @author Angela
 */
public class MainMenuControl {
    
       
    public void startGame() {
                
       GameMenuView gameMenu = new GameMenuView();
        gameMenu.getInput();
         
    }
    
    public void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.getInput();
    }
    
    private String quitGame() {
        System.out.println("\n\tAre you sure you want to quit? (Y or N)");
        Scanner inFile = new Scanner(System.in);
        String answer = inFile.next().trim().toUpperCase();
        if (answer.equals("Y")) {
            return Game.EXIT;
        }

        return (String) Game.PLAYING;
    }
}