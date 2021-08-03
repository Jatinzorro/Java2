
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
public class ChangeHistory {
    private ArrayList<Double> list;

    public ChangeHistory() {
        this.list=new ArrayList<>();
    }
    
    public void add(double status) {
        this.list.add(status);
    }
    public void clear() {
        this.list.clear();
    }
    
    public double maxValue(){
        if(this.list.isEmpty()){
            return 0.0;
        }
        return Collections.max(list);
    }
    
    public double minValue(){
        if(this.list.isEmpty()){
            return 0.0;
        }
        return 1.0*Collections.min(list);
    }
    
    
    public double average(){
        double sum=0;
        if(list.isEmpty()){
            return sum;
        }
        for(double e:list){
            sum+=e;
        }
        return 1.0*sum/list.size();
    }
    
    
    public String toString(){
        return list.toString();
    }
}
