/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package checkers;

/**
 *
 * @author Angela
 */
public class HelpMenuControl {
    public HelpMenuControl() {
        
    }

    public void displayBoardHelp() {
        System.out.println();
        this.displayHelpBorder();
        System.out.println(
                "\tThe game board for Checkers. It consist of a grid of "
                + "\n\tlocations. Players move their markers diagonally across "
                + "\n\tthe board in an effort to win the game. The default board is "
                + "\n\t8 rows by 8 columns.");
        displayHelpBorder();
    }
    
    
        
    public void displayGameHelp() {
        System.out.println();
        displayHelpBorder();
        System.out.println(
                 "\tThe objective of the game is to be the first player to move all of "
                + "\n\ttheir markers diagonally across the board. Each player takes "
                + "\n\tturns moving their marker one square, or jumping diagonally over "
                + "\n\tanother player's marker. The opponents markers that are jumped "
                + "\n\tover are removed from the board. The first player to get all of "
                + "\n\ttheir markers (or all their remaining markers) to the other side "
                + "\n\tof the board is the winner."
                );
        displayHelpBorder();
    }
            
    public void displayRealPlayerHelp() {
        System.out.println();
        displayHelpBorder();
        System.out.println(
                "\tA player takes their turn by moving a marker diagonally one space "
                + "\n\ton the board. A player may jump over the opposing player's "
                + "\n\tmarkers as many times at possible as long as they continue to "
                + "\n\tjump forward in a diagonal direction without skipping a square."
                );
        displayHelpBorder();
    }
    
                   
    public void displayComputerPlayerHelp() {
        System.out.println();
        displayHelpBorder();
        System.out.println(
                "\tA computer based player is not available in this version "
                );
        displayHelpBorder();
    }
             
    public void displayLocationHelp() {
        System.out.println();
        displayHelpBorder();
        System.out.println(
               "\tA location on the board where a player can move their marker"
                );
        displayHelpBorder();
    }
                 
    public void displayMarkerHelp() {
        System.out.println();
        displayHelpBorder();
        System.out.println(
               "\tA symbol that \"marks\" the locations in the board that are occupied "
                + "by a player. "
                + "\n\tThe default markers are \"Red\" and \"Black\"."
                );
        displayHelpBorder();
    }
    
    
    public void displayHelpBorder() {
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
       
}
