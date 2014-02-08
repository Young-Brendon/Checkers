/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package checkers;

/**
 *
 * @author Brendon
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