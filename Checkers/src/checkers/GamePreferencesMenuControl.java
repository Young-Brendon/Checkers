package checkers;

/**
 * * @author Brendon
 */
public class GamePreferencesMenuControl {    
            
    
    public void getMarker() { 
        
        Marker marker = new Marker();
        marker.displayMarker();       
      
    }        
    
    public void getBoardSize()  {        
        
        Board board = new Board();
        board.getRows();
        board.getColumns();
        board.displaySize();        
    }   
    
}