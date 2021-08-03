/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jatin Sharma
 */
public class Book implements Packable{
    private String author;
    private String bname;
    private double bweight;

    public Book(String author, String bname, double bweight) {
        this.author = author;
        this.bname = bname;
        this.bweight = bweight;
    }
    
    @Override
    public double weight() {
        return this.bweight;
    }

    @Override
    public String toString() {
        return this.author+": "+this.bname;
    }
    
    
    
}
