package byui.cit260.checkers.controls;

import byui.cit260.checkers.models.Game;
import byui.cit260.checkers.models.Player;
import byui.cit260.checkers.enums.GameType;

/**
 * * @author Angela
 */
public class MainMenuControl {
       
    private static final String PLAYER_A_DEFAULT_MARKER = "R";
    private static final String PLAYER_B_DEFAULT_MARKER = "B";
    
      public Game create(GameType gameType) {
        
        Game game = null;
        Player playerA = null;
        Player playerB = null;
        
         if (gameType == null) {
            throw new IllegalArgumentException ("MainCommands - create: gameType is null");
        }
         
        else if (gameType.equals(GameType.TWO_PLAYER)) {
            game = new Game(GameType.TWO_PLAYER);
            playerA = new Player(Player.REGULAR_PLAYER, PLAYER_A_DEFAULT_MARKER);
            playerB = new Player(Player.REGULAR_PLAYER, PLAYER_B_DEFAULT_MARKER);

        }
         
        game.setPlayerA(playerA);
        game.setPlayerB(playerB);
                
        return game;
    } 
}      