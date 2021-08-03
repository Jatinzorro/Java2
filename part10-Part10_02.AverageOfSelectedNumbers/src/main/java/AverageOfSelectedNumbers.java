
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<String> inputs=new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        while(true){
            String row=scanner.nextLine();
            if(row.equals("end")){
                System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
                String userInput=scanner.nextLine();
                if(userInput.isEmpty()){
                    continue;
                }
                if(userInput.toLowerCase().equals("n")){
                    double averageofNegatives=inputs.stream().mapToInt(s->Integer.valueOf(s))
                            .filter(i-> i<0).average().getAsDouble();
                    System.out.println("Average of the negative numbers: "+averageofNegatives);
                    
                }else if(userInput.toLowerCase().equals("p")){
                    double averageOfPositives=inputs.stream()
                            .mapToInt(s->Integer.valueOf(s))
                            .filter(i-> i>=0).average().getAsDouble();
                    System.out.println("Average of the positive numbers: "+averageOfPositives);
                }
                
               break; 
                
            }
            inputs.add(row);
            
            
        }
    }
}
