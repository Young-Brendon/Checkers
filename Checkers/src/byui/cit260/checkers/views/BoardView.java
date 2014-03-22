
package byui.cit260.checkers.views;
import byui.cit260.checkers.models.Board;
import java.util.Scanner;


/**
  * @author Cody
 */
public class BoardView { 
 
    Board board;
    
    //@Override
    //public Object display(Object object) {
        
        //this.board = (Board) object;
        //this.printHeadRow();
        //for (int i = 0; i < this.board.getRowCount(); i++) {
            //Player[] rowOfLocations = this.board.getBoardLocations()[i];
            //this.printRow(i+1, rowOfLocations);
            //this.printDividerRow();
        //}
        //System.out.println();
         
        //return null;
    //} 
          
          
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
        /*this selects a piece according to the Coordinates given still needs alot of work*/
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
    
        if((boardDisplay[(x1)][(y1)]=="R") || (boardDisplay[(x1)][(y1)]=="B")) {
            boardDisplay[(x1)][(y1)]=" ";
        }
            else System.out.println("Invalid selection. Please try again.");
}


    public void movePiece(){
    /* this doesnt work but it is a start I think its supposed to draw the piece in its new location.*/
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
    
       if((boardDisplay[(x1)][(y1)]) != "R") { //|| ((board[(x1)][(y1)]) != "B") || ((board[(x1)][(y1)]) != "-")) {
           boardDisplay[(x1)][(y1)]="B";
           display();
            
        }
       
       else if (((boardDisplay[(x1)][(y1)]) != "B")){
           boardDisplay[(x1)][(y1)]="R";
           display();
       }
            else System.out.println("Invalid selection. Please try again.");
        

    }
}  
    
/*   
private void printHeadRow() {
        System.out.println("|--------------Checkers--------------|");
          this.printDividerRow();
          //this.printHeadRow();
          System.out.println("\n| | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 |"); 
          this.printDividerRow();
        } 
    
private void printDividerRow() {

        // print first cell

        System.out.print("\n|");
        int columnsInRow = this.board.getColumnCount();
        // print remaining cells in row
        for (int i = 1; i < columnsInRow - 1; i++) {
            System.out.print("------");
        }
        System.out.print("|");
    }
    
    private void printRow(int rowNumber, Player[] rowLocations) {
        
        // print first cell
        String letter = " ";
        if (rowLocations[0] != null) {
            letter = rowLocations[0].getMarker();
        }
        System.out.print("\n" + rowNumber + " | " + letter + " |");

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
 