
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
public class Box implements Packable{
    private double max;
    private ArrayList<Packable> itemsInBox;
//it means Box can Cpontain another box as well
    public Box(double max) {
        this.max = max;
        this.itemsInBox = new ArrayList<>();
    }
    
    public void add(Packable item){
        if(this.weight()+item.weight()<=max){
            itemsInBox.add(item);
        }
    }

    @Override
    public double weight() {
        double sum=0;
        
        for(Packable e: itemsInBox){
            sum+=e.weight();
        }
        return (double)sum;
    }

    @Override
    public String toString() {
        return "Box: "+itemsInBox.size()+" items, total weight "+this.weight()+" kg";
    }
    
    
    
    
}
