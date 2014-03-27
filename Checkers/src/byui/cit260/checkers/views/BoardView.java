
package byui.cit260.checkers.views;
import byui.cit260.checkers.models.Board;
import java.util.Scanner;


/**
  * @author Cody
 */
public class BoardView { 
 
    Board board;          
          
    String[][] boardDisplay = {
        {"B","-","B","-","B","-","B","-"},
        {"-","B","-","B","-","B","-","B"},
        {"B","-","B","-","B","-","B","-"},
        {"-"," ","-"," ","-"," ","-"," "},
        {" ","-"," ","-"," ","-"," ","-"},
        {"-","R","-","R","-","R","-","R"},
        {"R","-","R","-","R","-","R","-"},
        {"-","R","-","R","-","R","-","R"},
    };    
    
    public void display() {
        
         /*adds the other characters to display the board.*/
        System.out.println("|--------------Checkers-------------|");
        System.out.println("|-----------------------------------|");
        System.out.println("|   | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 |"); 
        System.out.println("|-----------------------------------|");
        
        for (int row=0;row<this.boardDisplay.length;row++) {
            System.out.print("| " +  (row+1) + " ");   
          
        for(int col=0; col<this.boardDisplay.length;col++){
            System.out.print("| " +this.boardDisplay[row][col]+" ");
        
        }
        
        System.out.println("|");
        System.out.println("|-----------------------------------|");
        
        }
               
    }
    
    public void selectPiece(){
       
        Scanner input = new Scanner(System.in);
  
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
    
        if(("R".equals(boardDisplay[(x1)][(y1)])) || ("B".equals(boardDisplay[(x1)][(y1)]))) {
            boardDisplay[(x1)][(y1)]=" ";
        }
            else System.out.println("Invalid selection. Please try again.");
}


    public void movePiece(){
    
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
    
       if(!"R".equals(boardDisplay[(x1)][(y1)])) {
           boardDisplay[(x1)][(y1)]="B";
           display();
            
        }
       
       else if ((!"B".equals(boardDisplay[(x1)][(y1)]))){
           boardDisplay[(x1)][(y1)]="R";
           display();
       }
            else System.out.println("Invalid selection. Please try again.");
        

    }
}