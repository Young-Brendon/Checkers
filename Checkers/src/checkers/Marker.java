/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package checkers;

/**
 *
 * @author Brendon Young
 */
public class Marker {    
    
    char markerA = 'Red';    
    char markerB = 'Black';
    
    public Marker(){
        
    }
    public void displayMarker(){
        
        System.out.println("\n\tHere are the default pieces in the game: " + this.markerA + ", "
                           + this.markerB);
    }
    
}



