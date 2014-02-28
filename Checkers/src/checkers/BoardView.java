
package checkers;

import java.util.Scanner;

/**
  * @author Cody
 */
public class BoardView {    
 
    String[][] board = {
        {"-","R","-","R","-","R","-","R"},
        {"R","-","R","-","R","-","R","-"},
        {"-","R","-","R","-","R","-","R"},
        {" ","-"," ","-"," ","-"," ","-"},
        {"-"," ","-"," ","-"," ","-"," "},
        {"B","-","B","-","B","-","B","-"},
        {"-","B","-","B","-","B","-","B"},
        {"B","-","B","-","B","-","B","-"},
    };
    
    void displayBoard() {
          System.out.println("|--------------Checkers-------------|");
          System.out.println("|-----------------------------------|");
          System.out.println("| 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 |"); 
          System.out.println("|-----------------------------------|");
        for (int row=0;row<this.board.length;row++) {
         
       System.out.print("| " +  1 + " ");   
          for(int col=0; col<this.board.length;col++){
            
        System.out.print("| " +this.board[row][col]+" ");
        
        }
          System.out.println("|");
          System.out.println("|-----------------------------------|");
        
        }
        this.selectPiece();
    }
void selectPiece(){
    Scanner input = new Scanner(System.in);
  
    System.out.println("Please Select a piece According to your color you are");
    System.out.print("Type in the Column for the piece: ");
 
    String x = input.next();
    System.out.print("Type in the Row for the piece: ");
    input = new Scanner(System.in);
    String y = input.next();
    int x1 = Integer.parseInt(x);
    int y1 = Integer.parseInt(y);
        switch (board[x1][y1]) {
            case "R":
                board[x1][y1] = " ";
               this.movePiece();
                break;
            case "B":
                 board[x1][y1] = " ";
                 this.movePiece();
                break;
            default:
                System.out.print("There is no Piece there"); 
                        
                break;
        }

}
void movePiece(){
 Scanner input = new Scanner(System.in);
 System.out.print("Please indicate your color R or B");
 String color =input.next();
 System.out.print("Please input Where you would like to move this piece ");
 
 System.out.print("Type in the Column for the move: ");
 String x = input.next();
    System.out.print("Type in the Row for the move: ");
    input = new Scanner(System.in);
    String y = input.next();
    int x1 = Integer.parseInt(x);
    int y1 = Integer.parseInt(y);
        switch (board[x1][y1]) {
            case "-":
                System.out.println("You cannot move here!");
               this.movePiece();
                break;
            case " ":
                 board[x1][y1] = color;              
                break;
            default:
                System.out.print("there is already a Piece Here"); 
                        
                break;
        }

}
}



