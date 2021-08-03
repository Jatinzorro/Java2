
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jatin Sharma
 */
public class IOU {
    private HashMap<String,Double> hash;

    public IOU() {
        this.hash=new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount){
        double sum=this.hash.getOrDefault(toWhom, 0.0);
        sum+=amount;
        this.hash.put(toWhom, sum);
    }
    
    public double howMuchDoIOweTo(String toWhom){
        double val=this.hash.getOrDefault(toWhom, 0.0);
        return val;
    }
}
