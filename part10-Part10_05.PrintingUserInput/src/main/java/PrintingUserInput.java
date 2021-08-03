
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs=new ArrayList<>();
        while(true){
            String val=scanner.nextLine();
            if(val.equals("")){
                break;
            }
            inputs.add(val);
        }
        inputs.stream().forEach(value->System.out.println(value));
    }
}
