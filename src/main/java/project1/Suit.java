

package project1;

/**
 *This class +++Insert Description Here+++
 *
 * @author gazal
 * @author riddhi, 2020
 * @author jasmeen, 2020
 */
public class Suit{
    
    protected int randomSuit; //protected attribute randomSuit
    protected String suit; //protected attribute suit
    public int getSuit() // method getSuit generating random integer
    {
        randomSuit = (int) (Math.random()*4+1); //rolls a number between 1 and 4
        return randomSuit;
        
    }
    public String suit() //method suit returning suit name
    {
        if (randomSuit == 1)  suit = "Hearts";
        else if (randomSuit == 2) suit = "Diamonds";
        else if (randomSuit == 3) suit = "Clubs";
        else  suit = "Spades";
        return suit;

    }
} // end class Suit
