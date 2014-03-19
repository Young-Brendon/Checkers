package byui.cit260.checkers.views;

import byui.cit260.checkers.views.HelpMenuView;
import byui.cit260.checkers.views.GameMenuView;
import byui.cit260.checkers.controls.Checkers;
import byui.cit260.checkers.models.Game;
import byui.cit260.checkers.controls.MainMenuControl;
import byui.cit260.checkers.views.SelectPlayersView;
import java.util.Scanner;
/**
 * * @author Angela
 */
public class MainMenuView extends Menu{
    
    private static final String[][] menuItems = {
    //    {"E", "Enter players names"},
        {"S", "Start game"},
        {"H", "Help"},
        {"X", "Exit Checkers"}
    };  
    
  MainMenuControl mainCommands = new MainMenuControl();
    
    public MainMenuView() {  
        super(MainMenuView.menuItems);    
    }
    
    @Override
   public String executeCommands(Object object) {
        
        String gameStatus = Game.PLAYING;
        do {
            this.display();

            // get commaned entered
            String command = this.getCommand();
            switch (command) {
                case "S":
                    this.startGame(2);
                    break;
                case "H":
                    HelpMenuView helpMenu = Checkers.getHelpMenu();
                    helpMenu.executeCommands(null);
                    break;
                case "X":
                    return Game.EXIT;
            }
        } while (!gameStatus.equals(Game.EXIT));

        return Game.EXIT;
    }

    private void startGame(long noPlayers) {
        Game game;        
        game = this.mainCommands.create(Game.TWO_PLAYER);
                
        SelectPlayersView selectPlayersView = new SelectPlayersView(game);
        String status = (String) selectPlayersView.selectPlayers(Checkers.getNameList());
        if (status.equals(Game.QUIT)) {
            return;
        }

        GameMenuView gameMenu = new GameMenuView(game);
        gameMenu.executeCommands(game);
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
    
}