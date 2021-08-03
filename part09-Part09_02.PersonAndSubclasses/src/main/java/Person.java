/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jatin Sharma
 */
public class Person {
    private String name;
    private String ad;

    public Person(String name, String ad) {
        this.name = name;
        this.ad = ad;
    }

    @Override
    public String toString() {
        return this.name+"\n  "+this.ad;
    }
    
    
    
}
