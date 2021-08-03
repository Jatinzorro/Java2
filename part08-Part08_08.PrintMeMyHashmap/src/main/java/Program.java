
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }
    
    public static void printKeys(HashMap<String,String> hashmap){
        for(String h:hashmap.keySet()){
            System.out.println(h);
        }
    }
    
    public static void printKeysWhere(HashMap<String,String> hashmap, String text){
        for(String h:hashmap.keySet()){
            if(h.contains(cleanString(text))){
                System.out.println(h);
            }   
        }
    }
    
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text){
        for(String h:hashmap.keySet()){
            if(h.contains(cleanString(text))){
                System.out.println(hashmap.get(h));
            }   
        }
    }
    
    public static String cleanString(String strToClean){
        if(strToClean==null){
            return "";
        }
        return strToClean.toLowerCase().trim();
    }
}
