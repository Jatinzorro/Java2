/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jatin Sharma
 */
public class Student extends Person{
    private int credit;
    
    public Student(String name, String ad) {
        super(name, ad);
        this.credit=0;
    }
    public int credits(){
        return this.credit;
    }
    
    public void study(){
        this.credit++;
    }

    @Override
    public String toString() {
        return super.toString()+"\n  "+"Study credits "+this.credit; 
    }
    
    
    
}
