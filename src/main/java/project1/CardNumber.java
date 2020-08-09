

package project1;

/**
 *This class +++Insert Description Here+++
 *
 * @author gazal
 * @author riddhi, 2020
 * @author jasmeen, 2020
 */
public class CardNumber{
    
    private int randomCardNo; //private attribute randomCardNo
    private String num; //private attribute num
 public String getCardName() //method getCardName 
    {
        randomCardNo = (int) (Math.random()*13+1); //rolls a number between 1 and 13
        if (randomCardNo == 1)  num= "Ace";
        else if (randomCardNo == 2) num = "2";
        else if (randomCardNo == 3) num = "3";
        else if (randomCardNo == 4) num = "4";
        else if (randomCardNo == 5) num = "5";
        else if (randomCardNo == 6) num = "6";
        else if (randomCardNo == 7) num = "7";
        else if (randomCardNo == 8) num = "8";
        else if (randomCardNo == 9) num = "9";
        else if (randomCardNo == 10)num = "10";
        else if (randomCardNo == 11)num = "Jack";
        else if (randomCardNo == 12)num = "Queen";
        else num = "King";
        return num;
        
    }
}// end class CardNumber
