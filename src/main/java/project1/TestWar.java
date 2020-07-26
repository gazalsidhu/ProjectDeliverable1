

package project1;
import java.util.ArrayList;      
import java.util.Random;        
import java.util.List;          
import java.util.Collections;   
import java.util.LinkedList;
/**
 *This class +++Insert Description Here+++
 *
 * @author gazal, 2020
 * @author riddhi, 2020
 * @author jasmeen, 2020
 */
public class TestWar extends War{
public static void main(String []args){

 List<War> cardDeck = new ArrayList<War>(); 
        
        
        
        Collections.shuffle(cardDeck, new Random()); 
        
        System.out.println("War of cards");
        
        LinkedList<War> deck1 = new LinkedList<War>();
        LinkedList<War> deck2 = new LinkedList<War>();
        
        deck1.addAll(cardDeck.subList(0, 25));                    
        deck2.addAll(cardDeck.subList(26, cardDeck.size()));

        
            
        }  

    }       



