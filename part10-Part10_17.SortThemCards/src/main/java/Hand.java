
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jatin Sharma
 */
public class Hand implements Comparable<Hand>{
    private ArrayList<Card> hand;

    public Hand() {
        this.hand=new ArrayList<>();
    }
    
    public void add(Card card){
        this.hand.add(card);
    }
    
    public void print(){
        for(Card card:this.hand){
            System.out.println(card.toString());
        }
    }
    
    public void sort(){
        Collections.sort(this.hand);
    }
    
    public void sortBySuit(){
        Collections.sort(this.hand, new BySuitInValueOrder());
    }
    
    

    
    
    
    
    @Override
    public int compareTo(Hand o) {
        int thisVal=this.hand.stream()
                .map(card->card.getValue())
                .reduce(0,(a,b)->a+b);
        int otherval=o.hand.stream()
                .map(card->card.getValue())
                .reduce(0,(a,b)->a+b);
        return thisVal-otherval;
    }
    
}
