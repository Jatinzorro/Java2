
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        List<String> inputs=new ArrayList<>();
        while(true){
            String s=scanner.nextLine();
            if(s.equals("end")){
                double average=inputs.stream().mapToInt(r->Integer.valueOf(r)).average().getAsDouble();
                System.out.println("average of the numbers: "+average);
                
                break;
            }
            inputs.add(s);
            
        }
    }
}
