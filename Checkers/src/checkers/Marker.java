/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package checkers;

/**
 *
 * @author Angela
 */
public class Marker extends MarkerSuper {
    

    
    Marker(int r, int b) {
        
        super(r, b);
    }    
    
    @Override
    double markerColor() {
            
        return getRed() + getBlack();
            
    }
}
