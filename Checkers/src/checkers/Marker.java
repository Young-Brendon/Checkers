package checkers;
/**
 * * @author Brendon Young
 */
public class Marker {    
    
    String markerA = "red";  
    String markerB = "black";
    double pieces = 0;
    int rows = 8;
    int columns = 12;

    
    public Marker(){
        
    }
    public void displayMarker(){
      
        System.out.println("\n\tHere are the default pieces in the game: " + this.markerA + ", "
                           + this.markerB);
    }
      public void getPieces(){
        //future insert - get column and row count inputs       
        if (rows>6){
        pieces = (int) ((columns/2)*3);
        }
        else pieces = (int) columns;
        System.out.println("\n\tEach player will have " + (int)pieces + " pieces for this board."
                           + "\n");
    }
}



