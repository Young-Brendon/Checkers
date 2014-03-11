package checkers;

import java.util.Scanner;
/**
 * * @author Angela
 */
public class MainMenuControl {
        
      public Game create(String gameType) {
        
        Game game = null;
        Player playerA = null;
        Player playerB = null;
                
        game = new Game();
            playerA = new Player(Player.REGULAR_PLAYER, game.PLAYER_A_DEFAULT_MARKER);
            playerB = new Player(Player.REGULAR_PLAYER, game.PLAYER_B_DEFAULT_MARKER);
         
        game.setPlayerA(playerA);
        game.setPlayerB(playerB);
        
        return game;
    }
    
    private String quitGame() {
        System.out.println("\n\tAre you sure you want to quit? (Y or N)");
        Scanner inFile = new Scanner(System.in);
        String answer = inFile.next().trim().toUpperCase();
        if (answer.equals("Y")) {
            return Game.EXIT;
        }

        return Game.PLAYING;
    }
    
    public void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.getInput(null);
    }
    
}