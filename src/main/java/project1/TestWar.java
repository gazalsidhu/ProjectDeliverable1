

package project1;
import java.util.ArrayList;      
import java.util.Random;        
import java.util.List;          
import java.util.Collections;   
import java.util.LinkedList;
import java.util.Scanner;
/**
 *This class +++Insert Description Here+++
 *
 * @author gazal, 2020
 * @author riddhi, 2020
 * @author jasmeen, 2020
 */
public class TestWar extends War{ 
public static void main(String args[])
{
      
        boolean playing = true;
        int myScore = 0;
        int oppsScore = 0;
        int round = 0;
        int increment = 1;
        String response = null;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int input = scan.nextInt();
        
        while (playing) {
            if (input == 0 || input < 0)
            {
                System.out.println("INVALID ROUND NUMBER ENTERED!");
                playing = false;
                 break;
            }
            else{
    
                while (round <= input)
                {
                War myCard = new War(); //object myCard
                War oppsCard = new War(); //object oppsCard
                System.out.println("You have the " + myCard.toString());
                System.out.println("The computer has the " + oppsCard.toString());
                if (myCard.getSuit() > oppsCard.getSuit())
                {
                    myScore += 1;
                    System.out.println("You win!");
                }
                else if (oppsCard.getSuit() > myCard.getSuit())
                {
                    oppsScore += 1;
                     System.out.println("You lose!");
                }
                else
                {
                    increment *= 2;
                    System.out.println("WAR!!!!");
                    System.out.println("It's a tie!");
                }
               
                System.out.println("Your score: " + myScore);
                System.out.println("Computer's score: " + oppsScore);
                
               
                System.out.println("\n\nIf you want to play again enter 'y':");
                String input2 = scan.next();
                    do {
                        response = input2;
                        if (!(response.equalsIgnoreCase("y")) && !(response.equalsIgnoreCase("n"))) {
                        playing = true;

                        } 
                        else{
                            break;
                            }
			}while (true);
                }while(response.equalsIgnoreCase("y"));
               
                } //end else       
            }  //end while             
        }  //end main method      
    }//end class test




 



