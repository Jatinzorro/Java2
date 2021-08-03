
import java.util.ArrayList;
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
public class StorageFacility {
    private HashMap<String,ArrayList<String>> store;

    public StorageFacility() {
        this.store=new HashMap<>();
    }
    
    public void add(String unit, String item){
        this.store.putIfAbsent(unit, new ArrayList<>());
        
        this.store.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit){
        ArrayList<String> res=new ArrayList<>();
        return this.store.getOrDefault(storageUnit, res);
    }
    
    public void remove(String storageUnit, String item){
        this.store.get(storageUnit).remove(item);
        
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> s=new ArrayList<>();
        for(String a:store.keySet()){
            if(!store.get(a).isEmpty()){
                s.add(a);
            } 
        }
        return s;
    }
    
    
    
    
}
