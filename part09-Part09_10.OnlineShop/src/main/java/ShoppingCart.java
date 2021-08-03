
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jatin Sharma
 */
public class ShoppingCart {
    private Map<String ,Item > itemMap;

    public ShoppingCart() {
        this.itemMap=new HashMap<>();
    }
    
    public void add(String product, int price){
        if(itemMap.keySet().contains(product)){
            increaseQuantity(product);
        }else{
            itemMap.put(product, new Item(product, 1,price));
        }
    }
    
    public int price(){
        int sum=0;
        for(Item i:itemMap.values()){
            sum+=i.price();
        }
        return sum;
    }

    private void increaseQuantity(String product) {
        this.itemMap.get(product).increaseQuantity();
    }
    
    public void print(){
        for(String e:itemMap.keySet()){
            System.out.println(itemMap.get(e).toString());
        }
    }
    
    
}
