/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package checkers;

/**
 *
 * @author Brendon Young
 */
public class Board {
    
    int rowCount = 8;
    int columnCount = 8;
    
public Board() {
    }

public void displaySize() {
        System.out.println("\n\tThe board is " + this.rowCount + " by " 
                           + this.columnCount + " in size.");
    }
}
