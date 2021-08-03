/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jatin Sharma
 */
public class Container {
    private int amount;

    public Container() {
        this.amount=0;
    }
    
    public int contains(){
        return this.amount;
    }
    
    public void add(int amount){
        if(amount<0){
            return;
        }else if(this.contains()+amount<=100){
            this.amount+=amount;
        }else{
            this.amount=100;
        }
    }
    
    public void remove(int amount){
        if(amount<0){
            return;
        }
        if(this.contains()-amount<0){
            this.amount=0;
        }else{
            this.amount-=amount;
        }
    }

    @Override
    public String toString() {
        return this.contains()+"/100";
         }
    
    
    
}
