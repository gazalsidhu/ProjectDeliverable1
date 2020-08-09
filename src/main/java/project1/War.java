

package project1;

/**
 *This class will return card name 
 * and number and called in test class.
 *
 * @author gazal, 2020
 * @author riddhi, 2020
 * @author jasmeen, 2020
 */
public class War extends Suit {
 
Suit suitObj = new Suit(); // object of suit class
CardNumber cardObj = new CardNumber(); // object of cardNumber class

    @Override  
    public String toString() //return suit and card number
    {
        return cardObj.getCardName()+" of "+suitObj.suit();
    } //end method toString
    
    
}// end class War
