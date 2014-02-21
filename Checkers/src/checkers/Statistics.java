package checkers;
/**
  * @author Brendon
 */
public class Statistics {
    
    double wins = 5;
    double losses = 8;
    int moves[] = {24, 52, 29, 33, 41, 27, 46 };
    int sum = 0;
    double ave = 0;
            
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
        
        for(int x : moves) {
            sum += x;
            ave = sum/moves.length;
        }
        System.out.println("The average number of moves per game is " + ave);

    }
    
}


