
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jatin Sharma
 */
public class Herd implements Movable{
    private List<Movable> herdList;

    public Herd() {
        this.herdList=new ArrayList<>();
    }
    
    public void addToHerd(Movable movable){
        herdList.add(movable);
    }
    
    
    @Override
    public void move(int dx, int dy) {
        for(Movable m:herdList){
            m.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String newString="";
        for(Movable mov: herdList){
            newString+=mov.toString().trim()+"\n";
        }
        
        return newString;
    }
    
    
    
}
