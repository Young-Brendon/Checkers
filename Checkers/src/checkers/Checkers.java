
package checkers;

import java.util.Scanner;

/**
 *
 * @author Angela and Brendon
 */
public class Checkers {
      String welcomeMsg =
              "\n\t***********************************************************************"
            + "\n\t* Welcome to the game of Checkers!                                    *"
            + "\n\t* You will be playing against a partner. The object of the game       *"
            + "\n\t* is to remove all of your opponents pieces from the board.           *"
            + "\n\t*                                                                     *"
            + "\n\t* Good Luck!!!                                                        *"
            + "\n\t***********************************************************************"
            + "\n";
      String name1;
      String name2;
      

    public Checkers(){
    }
   
    public static void main(String[] args) {
             
        Checkers checkers = new Checkers();       
        checkers.display();
        
        HelpMenuView helpMenuView = new HelpMenuView();        
        helpMenuView.getInput();
    }
    
    private void display() {
        System.out.println(this.welcomeMsg);
    }
    
    private void getName() {
            Scanner input = new Scanner(System.in);
            System.out.println("Player 1 - Enter your name: ");
            this.name1 = input.next();
            System.out.println("Player 2 - Enter your name");
            this.name2 = input.next();
    }
    //public void displayHelp(){
        //System.out.println("\nWelcome " + name1 + " and " + name2 + "!\n");
    //}
  
}