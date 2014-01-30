
package checkers;

import java.util.Scanner;

/**
 *
 * @author Brendon Young
 */
public class Board {
    
    int rows;
    int columns;
      
public Board() {
}
          public void getRows() {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter an even number of rows from 6 to 10: ");
            rows = input.nextInt();
            if(rows < 6){
               System.out.println("\n\tThe number of rows must be "
                    + "\n\t an even number from 6 to 10.");
            return -999;
            }
            if(rows > 10){
               System.out.println("\n\tThe number of rows must be "
                    + "\n\t an even number from 6 to 10.");
            return -999;
            }
            if((rows%2)!=0){
               System.out.println("\n\tThe number of rows must be "
                    + "\n\t an even number from 6 to 10.");
            return -999;
            }
     }
          public void getColumns() {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter an even number of columns from 6 to 10: ");
            columns = input.nextInt();
            if(columns < 6){
               System.out.println("\n\tThe number of columns must be "
                    + "\n\t an even number from 6 to 10.");
            return -999;
            }
            if(columns > 10){
               System.out.println("\n\tThe number of columns must be "
                    + "\n\t an even number from 6 to 10.");
            return -999;
            }
            if((columns%2)!=0){
               System.out.println("\n\tThe number of columns must be "
                    + "\n\t an even number from 6 to 10.");
            return -999;
            }
     }

    public void displaySize() {
        System.out.println("\n\tThe board is " + rows + " by " 
                           + columns + " in size.");
    }
    public void displayBoardSize() {
        double boardSize = columns * rows;
        System.out.println("\n\tThe board has " + boardSize + " squares.");
    }
}
