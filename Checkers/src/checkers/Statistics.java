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
public class Statistics {
    
    double wins = 5;
    double losses = 8;
            
    public Statistics(){
    }
    
        public void displayStatistics(){
    
        double percentOfLosses = (wins / losses) * 100;
        double percentOfWins = 100 - percentOfLosses;
        
    
        if (percentOfLosses > percentOfWins){
            System.out.println("Losses percentage is greater than wins percentage."
                                + "\nPercent of Losses = " + (int)percentOfLosses
                                + "\nPercent of Wins = " + (int)percentOfWins);
        }
        else if (percentOfLosses < percentOfWins){
            System.out.println("Losses percentage is less than wins percentage."
                                + "\nPercent of Losses = " + (int)percentOfLosses
                                + "\nPercent of Wins = " + (int)percentOfWins);
        }
        else {
            System.out.println("Loses percentage and wins percentage are the same."
                                + "\nPercent of Losses = " + (int)percentOfLosses
                                + "\nPercent of Wins = " + (int)percentOfWins);
        }
    }
    
}


