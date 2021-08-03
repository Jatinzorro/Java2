
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jatin Sharma
 */
public class BoxWithMaxWeight extends Box{
    private ArrayList<Item> itemsInMaxBox;
    private int max;

    public BoxWithMaxWeight(int max) {
        this.max = max;
        this.itemsInMaxBox=new ArrayList<>();
    }
    
    public int currentAmount(){
        int sum=0;
        for(Item e:itemsInMaxBox){
            sum+=e.getWeight();
        }
        return sum;
    }
    
    
    @Override
    public void add(Item item) {
        if(currentAmount()+item.getWeight()<=this.max){
            itemsInMaxBox.add(item);
        }
    }

    @Override   
    public boolean isInBox(Item item) {
        return itemsInMaxBox.contains(item);
    }
    
}
