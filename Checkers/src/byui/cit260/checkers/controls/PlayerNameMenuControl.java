
package byui.cit260.checkers.controls;

import byui.cit260.checkers.models.Game;
import byui.cit260.checkers.models.Player;

/**
 *
 * @author jacksonrkj
 */
public class PlayerNameMenuControl {
    
    public static void savePlayersNames(Game game, String playerAName, String playerBName) {
       if (game == null 
               || playerAName == null
               || playerBName == null) {
           throw new IllegalArgumentException("savePlayersNames - parameter value is null");
       }
       Player playerA = game.getPlayerA();
       Player playerB = game.getPlayerB();
       playerA.setName(playerAName);
       playerB.setName(playerBName);
    }
    
}
