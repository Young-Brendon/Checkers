/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package checkers;

import java.io.Serializable;

/**
 *
 * @author Angela
 */
public abstract class MarkerSuper {
    
     //added for individual assignment
    private int red;
    private int black;
       
 //Added for individual assignment
    public MarkerSuper(int r, int b) {
        
        red = r;
        black = b;
    }    
      
    //Added for individual assignment    
    double getRed() {
        
        return red;
    }
    
    //Added for individual assignment
    void setRed(int r) {
        
        red = r;
    }
    
    //Added for individual assignment
    double getBlack() {
        
        return black;
    }
    
    //Added for individual assignment
    void setBlack(int b) {
        
        black = b;
    }
    
    //Added for individual assignment
    void showMarker() {
        
        System.out.println("Red Marker = " + red + ". Black Marker = " + black + ".");
    }
         
  //Added for individual assignment    
 double markerColor() {
        
        System.out.println("Overridden method");
        return 0;
    }     
}
