/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package checkers;

/**
 *
 * @author BDawg
 */
public class RegularPlayer extends Player {
    
    RegularPlayer() {
        
        super();        
    }
    
    RegularPlayer(int r, int c) {
        
        super(r, c);
    }    
    
    @Override
    double playOrder() {
            
        return getRegular() + getComputer();
            
    }
}
