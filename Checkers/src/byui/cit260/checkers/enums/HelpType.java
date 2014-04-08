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
    
    INSTRUCTIONS ("\tThe object of the game is to move all of your pieces to "
                + "\n\tthe other end of the board while removing as many of your "
                + "\n\topponents pieces as possible. " ),
    
    BOARD ("\tThe game board for Checkers. It consist of a grid of "
                + "\n\tlocations. Players move their markers diagonally across "
                + "\n\tthe board in an effort to win the game. The default board is "
                + "\n\t8 rows by 8 columns."),
                
                
    GAME ("\tThe objective of the game is to be the first player to move all of "
                + "\n\ttheir markers diagonally across the board. Each player takes "
                + "\n\tturns moving their marker one square, or jumping diagonally over "
                + "\n\tanother player's marker. The opponents markers that are jumped "
                + "\n\tover are removed from the board. The first player to get all of "
                + "\n\ttheir markers (or all their remaining markers) to the other side "
                + "\n\tof the board is the winner."), 
                
    REAL_PLAYER ("\tA player takes their turn by moving a marker diagonally one space "
                + "\n\ton the board. A player may jump over the opposing player's "
                + "\n\tmarkers as many times as possible as long as they continue to "
                + "\n\tjump forward in a diagonal direction without skipping a square."),
                
                 
    LOCATION ("\tA location on the board where a player can place their marker"),
                
    MARKER ("\tA symbol that \"marks\" the locations in the board that are occupied "
                + "by a player. "
                + "\n\tThe default markers are \"R\" and \"B\" which stands for Red and Black"
                + "\n\trespectively.");
    
    String helpText;

    private HelpType(String helpText) {
        this.helpText = helpText;
    }

    public String getHelpText() {
        return helpText;
    }
    
}
