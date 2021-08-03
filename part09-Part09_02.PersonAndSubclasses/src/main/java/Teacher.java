/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jatin Sharma
 */
public class Teacher extends Person{
    private int sal;
    
    public Teacher(String name, String ad,int sal) {
        super(name, ad);
        this.sal=sal;     
    }

    @Override
    public String toString() {
        return super.toString()+"\n  salary "+this.sal+" euro/month";
    }
    
    
}
