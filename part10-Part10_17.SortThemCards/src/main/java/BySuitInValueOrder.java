
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jatin Sharma
 */
public class BySuitInValueOrder implements Comparator<Card>{

    @Override
    public int compare(Card o1, Card o2) {
        int suitValOrder=o1.getSuit().ordinal()-o2.getSuit().ordinal();
        
        if(suitValOrder==0){
            return o1.compareTo(o2);
        }
        return suitValOrder;
    }
    
}
