/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.checkers.enums;

/**
 *
 * @author BDawg
 */
public enum HelpType {
    
    INSTRUCTIONS ("The object of the game is to move all of your pieces to "
                + "the other end of the board while removing as many of your "
                + "topponents pieces as possible. " ),
    
    BOARD ("The game board for Checkers. It consist of a grid of "
                + "locations. Players move their markers diagonally across "
                + "the board in an effort to win the game. The default board is "
                + "8 rows by 8 columns."),
                
                
    GAME ("The objective of the game is to be the first player to move all of "
                + "their markers diagonally across the board. Each player takes "
                + "turns moving their marker one square, or jumping diagonally over "
                + "another player's marker. The opponents markers that are jumped "
                + "over are removed from the board. The first player to get all of "
                + "their markers (or all their remaining markers) to the other side "
                + "of the board is the winner."), 
                
    REAL_PLAYER ("A player takes their turn by moving a marker diagonally one space "
                + "on the board. A player may jump over the opposing player's "
                + "markers as many times as possible as long as they continue to "
                + "jump forward in a diagonal direction without skipping a square."),
                
                 
    LOCATION ("A location on the board where a player can place their marker"),
                
    MARKER ("A symbol that \"marks\" the locations in the board that are occupied "
                + "by a player. "
                + "The default markers are \"R\" and \"B\" which stands for Red and Black"
                + "respectively.");
    
    String helpText;

    private HelpType(String helpText) {
        this.helpText = helpText;
    }

    public String getHelpText() {
        return helpText;
    }
    
}
