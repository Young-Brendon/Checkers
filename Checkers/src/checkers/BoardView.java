
package checkers;

/**
  * @author BDawg
 */
public class BoardView {    
   
    int row = 8;
    int column = 8;
    
    public BoardView() {           
    
    }
    
    void displayBoard(){
        
        this.printHeadRow();
        this.printDividerRow();
        for (int i = 0; i < row; i++) {           
            this.printRow();             
            this.printDividerRow();
            System.out.print(i + 1);
        }
          
        System.out.println();
    }

    private void printHeadRow() {       

        System.out.print("\n\t      1   ");
        int columnsInRow = column;
        
        for (int i = 1; i < columnsInRow - 1; i++) {
            int col = i + 1;
            System.out.print("  " + col + "   ");
        }
        System.out.print(" " + columnsInRow + "   ");
    }

    private void printDividerRow() {       

        System.out.print("\n\t  |------");
        int columnsInRow = column;
        
        for (int i = 1; i < columnsInRow - 1; i++) {
            System.out.print("------");
        }
        System.out.print("-----|");
    }

    private void printRow() {
        
        // print first cell
        String letter = " ";
        
        System.out.print("\n\t       " + " |  " + letter + "  |");
        // print remaining cells in row
        for (int i = 1; i < column-2; i++) {
            
            System.out.print("  " + letter + "  |");
        }
    }

}

