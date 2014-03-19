package byui.cit260.checkers.views;

import byui.cit260.checkers.views.HelpMenuView;
import byui.cit260.checkers.views.GameMenuView;
import byui.cit260.checkers.controls.Checkers;
import byui.cit260.checkers.models.Game;
import byui.cit260.checkers.controls.MainMenuControl;
import byui.cit260.checkers.views.SelectPlayersView;
import byui.cit260.checkers.interfaces.EnterInfo;
import java.util.Scanner;
import byui.cit260.checkers.enums.GameType;
import byui.cit260.checkers.enums.StatusType;
/**
 * * @author Angela
 */
public class MainMenuView extends Menu implements EnterInfo {
    
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
   public Object getInput(Object object) {
        
        StatusType gameStatus = StatusType.PLAYING;
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
                    helpMenu.getInput(null);
                    break;
                case "X":
                    return StatusType.EXIT;
            }
        } while (!gameStatus.equals(StatusType.EXIT));

        return StatusType.EXIT;
    }

    private void startGame(long noPlayers) {
        Game game;        
        game = this.mainCommands.create(GameType.TWO_PLAYER);
                
        SelectPlayersView selectPlayersView = new SelectPlayersView(game);
        StatusType status = selectPlayersView.selectPlayers(Checkers.getNameList());
        if (status.equals(StatusType.QUIT)) {
            return;
        }

        GameMenuView gameMenu = new GameMenuView(game);
        gameMenu.getInput(game);
    }

    private Object quitGame() {
        System.out.println("\n\tAre you sure you want to quit? (Y or N)");
        Scanner inFile = new Scanner(System.in);
        String answer = inFile.next().trim().toUpperCase();
        if (answer.equals("Y")) {
            return StatusType.EXIT;
        }

        return StatusType.PLAYING;
    }
    
}