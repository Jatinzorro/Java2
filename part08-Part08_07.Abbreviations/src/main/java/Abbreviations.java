
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
public class Abbreviations {
    private HashMap<String,String> abbrMap;

    public Abbreviations() {
        this.abbrMap=new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation){
        abbrMap.put(cleanString(abbreviation), explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        return this.abbrMap.containsKey(abbreviation);
    }
    
    public String findExplanationFor(String abbreviation) {
        return this.abbrMap.get(cleanString(abbreviation));
    }
    
    public String cleanString(String strToClean){
        if(strToClean==null){
            return "";
        }
        return strToClean.toLowerCase().trim();
    }
    
    
}
