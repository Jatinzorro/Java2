
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jatin Sharma
 */
public abstract class Pipe<T> implements List<T> {
    private List<T> listOfPipes;

    public Pipe() {
        this.listOfPipes=new ArrayList<>();
    }
    
    public void putIntoPipe(T value){
        listOfPipes.add(value);
    }
    
    public T takeFromPipe() {
        if(listOfPipes.isEmpty()){
            return null;
        }
        T value=listOfPipes.get(listOfPipes.size()-1);
        listOfPipes.remove(listOfPipes.size()-1);
        return value;
    }
    
    public boolean isInPipe(){
        if(listOfPipes.isEmpty()){
            return false;
        }else{
            return true;
        }
    }
    
}
