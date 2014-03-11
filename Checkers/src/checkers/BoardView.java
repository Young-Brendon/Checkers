
package checkers;

import java.util.Scanner;
/**
  * @author Cody
 */
public class BoardView { 
 
   // Board board;
    static final int Empty=0, Red=1, Black=2;
    int[][] board;
    
    public Object display(Object object) {
         //adds the other characters to display the board.
         // this.board = (Board) object;
          board = new int[8][8];
          this.printHeader();
          setUpGame();
          this.printDividerRow();
          return board;
    }
    
   void setUpGame(){
      for (int rowCount = 0; rowCount < 8; rowCount++) {
            for (int colCount = 0; colCount < 8; colCount++) {
               if ( rowCount % 2 == colCount % 2 ) {
                  if (rowCount < 3)
                     board[rowCount][colCount] = Black;
                  else if (rowCount > 4)
                     board[rowCount][colCount] = Red;
                  else
                     board[rowCount][colCount] = Empty;
               }
               else {
                  board[rowCount][colCount] = Empty;
               }
            }
         }
    }    
          
          
 /*    String[][] board = {
        {"B","-","B","-","B","-","B","-"},
        {"-","B","-","B","-","B","-","B"},
        {"B","-","B","-","B","-","B","-"},
        {"-"," ","-"," ","-"," ","-"," "},
        {" ","-"," ","-"," ","-"," ","-"},
        {"-","R","-","R","-","R","-","R"},
        {"R","-","R","-","R","-","R","-"},
        {"-","R","-","R","-","R","-","R"},
            };*/
     
    
    
private void printHeader() {
        System.out.println("|--------------Checkers-------------|");
          this.printDividerRow();
          //this.printHeadRow();
          System.out.println("\n|   | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 |"); 
          this.printDividerRow();     
        } 
    
private void printDividerRow() {
        System.out.print("|-----------------------------------|");     
        }

}
 /*      for (int i=0; i < this.board.getRowCount(); i++) {

         Player[] rowOfLocations = this.board.getBoardLocations()[i];
            this.printRow(i+1, rowOfLocations);
            this.printDividerRow();
        }
        System.out.println();
         
        return null;
    }
private void printHeadRow() {

        // print first cell

        System.out.print("\n\t 1 ");
        int columnsInRow = this.board.getColumnCount();
        // print remaining cells in row
        for (int i = 1; i < columnsInRow - 1; i++) {
            int col = i + 1;
            System.out.print(" " + col + " ");
        }
        System.out.print(" " + columnsInRow + " ");
    }*/

   /*  
 private void printRow(int rowNumber, Player[] rowLocations) {
        
        // print first cell
        String letter = " ";
        if (rowLocations[0] != null) {
            letter = rowLocations[0].getMarker();
        }
        System.out.print("\n\t" + rowNumber + " | " + letter + " |");

        // print remaining cells in row
        for (int i = 1; i < rowLocations.length; i++) {
            if (rowLocations[i] == null) {
                letter = " ";
            } else {
                letter = rowLocations[i].getMarker();
            }
            System.out.print(" " + letter + " |");
            }
    }    
}*/

    
   
/*public void selectPiece(){
    //this selects a piece according to the Coordinates given still needs alot of work
    Scanner input = new Scanner(System.in);
  
    //System.out.println("Please Select a piece According to your color you are");
    System.out.print("Type in the Column for the piece: ");
        input = new Scanner(System.in);
            String y = input.next();
    System.out.print("Type in the Row for the piece: ");
        input = new Scanner(System.in);
            String x = input.next();
    int y2 = Integer.parseInt(y);
    int x2 = Integer.parseInt(x);
    int y1 = y2-1;
    int x1 = x2-1;
    
        if((board[(x1)][(y1)]=="R") || (board[(x1)][(y1)]=="B")) {
            board[(x1)][(y1)]=" ";
            this.movePiece();
        }
            else System.out.println("Invalid selection. Please try again.");
}


public void movePiece(){
    // this doesnt work but it is a start I think its supposed to draw the piece in its new location.
 Scanner input = new Scanner(System.in);

 System.out.println("Please input where you would like to move this piece.");
 
 System.out.println("Type in the Column you want to move to: ");
    input = new Scanner(System.in);
       String y = input.next();
 System.out.print("Type in the Row you want to move to: ");
    input = new Scanner(System.in);
        String x = input.next();
    int y2 = Integer.parseInt(y);
    int x2 = Integer.parseInt(x);
    int y1 = y2-1;
    int x1 = x2-1;
    
       if((board[(x1)][(y1)]) != "R") { //|| ((board[(x1)][(y1)]) != "B") || ((board[(x1)][(y1)]) != "-")) {
           board[(x1)][(y1)]="B";
           displayBoard();
            
        }
       
       else if (((board[(x1)][(y1)]) != "B")){
           board[(x1)][(y1)]="R";
           displayBoard();
       }
            else System.out.println("Invalid selection. Please try again.");
        

    }*/




