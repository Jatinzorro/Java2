
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> input=new ArrayList<>();
        while(true){
            int val=Integer.valueOf(scanner.nextLine());
            if(val<0){
                input.stream().filter(num-> num<=5).forEach(num->System.out.println(num+ ""));
                break;
            }
            input.add(val);
        }
    }
}
