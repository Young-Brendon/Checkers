
package checkers;

import java.util.Scanner;

/**
  * @author Cody
 */
public class BoardView {    
 /*this initialize's the default layout of the board*/ 
    String[][] board = {
        {"B","-","B","-","B","-","B","-"},
        {"-","B","-","B","-","B","-","B"},
        {"B","-","B","-","B","-","B","-"},
        {"-"," ","-"," ","-"," ","-"," "},
        {" ","-"," ","-"," ","-"," ","-"},
        {"-","R","-","R","-","R","-","R"},
        {"R","-","R","-","R","-","R","-"},
        {"-","R","-","R","-","R","-","R"},
    };
    
    void displayBoard() {
         /*adds the other characters to display the board.*/
          System.out.println("|--------------Checkers-------------|");
          System.out.println("|-----------------------------------|");
          System.out.println("| - | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 |"); 
          System.out.println("|-----------------------------------|");
        
       for (int row=0;row<this.board.length;row++) {
              System.out.print("| " +  (row+1) + " ");   
          
          for(int col=0; col<this.board.length;col++){
              System.out.print("| " +this.board[row][col]+" ");
        
        }
          System.out.println("|");
          System.out.println("|-----------------------------------|");
        
        }
        this.selectPiece();
    }
    
    
public void selectPiece(){
    /*this selects a piece according to the Coordinates given still needs alot of work*/
    Scanner input = new Scanner(System.in);
  
    //System.out.println("Please Select a piece According to your color you are");
    System.out.print("Type in the Row for the piece: ");
        input = new Scanner(System.in);
            String y = input.next();
    System.out.print("Type in the Column for the piece: ");
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
    /* this doesnt work but it is a start I think its supposed to draw the piece in its new location.*/
 Scanner input = new Scanner(System.in);

 System.out.println("Please input Where you would like to move this piece ");
 
 System.out.println("Type in the Row for the piece: ");
    input = new Scanner(System.in);
       String y = input.next();
 System.out.print("Type in the Column for the piece: ");
    input = new Scanner(System.in);
        String x = input.next();
    int y2 = Integer.parseInt(y);
    int x2 = Integer.parseInt(x);
    int y1 = y2-1;
    int x1 = x2-1;
    
       if(((board[(x1)][(y1)]) != "R") || ((board[(x1)][(y1)]) != "B") || ((board[(x1)][(y1)]) != "-")) {
            //if(player=playerA){ ---- code to check for correct player
                board[(x1)][(y1)]="M";
                displayBoard();
            //}
        }
            else System.out.println("Invalid selection. Please try again.");
        

    }
}



