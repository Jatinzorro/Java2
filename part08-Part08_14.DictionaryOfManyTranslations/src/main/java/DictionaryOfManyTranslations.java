
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
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> map;

    public DictionaryOfManyTranslations() {
        this.map=new HashMap<>();
    }
    
    public void add(String word, String translation){
        this.map.putIfAbsent(word, new ArrayList<>());
        
        this.map.get(word).add(translation);
    }
    
    public ArrayList<String> translate(String word){
        ArrayList<String> res=new ArrayList<>();
        
       // res=this.map.get(word);
        
        return this.map.getOrDefault(word, res);
    }
    
    public void remove(String word) {
        this.map.remove(word);
    }
}
