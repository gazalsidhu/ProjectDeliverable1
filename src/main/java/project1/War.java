

package project1;

/**
 *This class +++Insert Description Here+++
 *
 * @author gazal, 2020
 * @author riddhi, 2020
 * @author jasmeen, 2020
 */
public class War extends Card {
private int suitNum;
private int CardNum;
private String CardValue;
private String SuitValue;
    
 
    public War()
    {    
         getSuit();
         getCardName();
         suit();
         name();
    }

 
    public int getSuit(){
        return suitNum; 
    }
    public int getCardName(){
        return CardNum; 
    }
    public String suit(){
        return SuitValue; 
    }
    public String name(){
        return CardValue; 
    }
    
    @Override
    public String toString() {
        return CardValue + " of " + SuitValue;
    }
   
}
