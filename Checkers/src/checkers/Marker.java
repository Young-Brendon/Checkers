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
    int r = 1;
    int c = 1;

    
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
      
      //place initial black markers
    public void placeBlack() {
        for(r=rows; r>(rows-3); r--){
            for(c=1; c<=columns; c++){
                if(((rows%2)!=0) && ((columns%2)!=0)){
                    System.out.print("B");
                    continue;
                }
                if(((rows%2) == 0) && ((columns%2) == 0)){  
                    System.out.print("B");
                }
            }
        }
    } 
    
       //place initial red markers
    public void placeRed() {
        for(r=1; r<4; r++){
            for(c=1; c<=columns; c++){
                if(((rows%2)!=0) && ((columns%2)!=0)){
                    System.out.print("R");
                    continue;
                }
                if(((rows%2) == 0) && ((columns%2) == 0)){  
                    System.out.print("R");
                }
            }
        }
    }  
      
}



