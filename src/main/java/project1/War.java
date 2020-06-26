

package project1;

/**
 *This class +++Insert Description Here+++
 *
 * @author gazal, 2020
 * @author riddhi, 2020
 * @author jasmeen, 2020
 */
public class War extends Card {
private int rank; 
    private int suit; 
    
 
    public War(int suit, int rank){
        this.rank = rank;
        this.suit = suit;
    }
    
 
    public int getWar(){
        return rank; 
    }
    public void setWar(int rank){
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "War{" + "rank=" + rank + ", suit=" + suit + '}';
    }
    
    
    
  

}
