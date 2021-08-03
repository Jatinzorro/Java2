
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
public class VehicleRegistry {
    private HashMap<LicensePlate,String> lp;
    //private String owner;

    public VehicleRegistry() {
        this.lp=new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        for(LicensePlate e:lp.keySet()){
            if(e.equals(licensePlate)){
                return false;
            }
        }
        lp.put(licensePlate,owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate){
        return lp.getOrDefault(licensePlate, null);
    }
    
    public boolean remove(LicensePlate licensePlate){
        if(!lp.containsKey(licensePlate)){
            return false;
        }
        lp.remove(licensePlate);
        return true;
    }
    
    public void printLicensePlates(){
        for(LicensePlate i:lp.keySet()){
            System.out.println(i);
        }
    }
    
    public void printOwners(){
        ArrayList<String> ownerList=new ArrayList<>();
        
        for(String e:lp.values()){
            if(!ownerList.contains(e)){
                ownerList.add(e);
            }
        }
        
        for(String e: ownerList){
            System.out.println(e);
        }
    }
    
    
}
