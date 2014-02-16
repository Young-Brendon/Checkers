package checkers;
/**
 * * @author Brendon Young
 */
public class Marker {    
    
    String markerA = "red";  
    String markerB = "black";
    int pieces = 12;
    int rows = 8;
    int columns = 8;

    
    public Marker(){
        
    }
    public void displayMarker(){
      
        System.out.println("\n\tHere are the default pieces in the game: " + this.markerA + ", "
                           + this.markerB);
    }
      public void getPieces(){
        //future insert - get column and row count inputs       
        if (rows>6){
        pieces = (columns/2)*3;
        }
        else pieces = columns;
        System.out.println("\n\tEach player will have " + (int)pieces + " pieces for this board."
                           + "\n");
    }
}



