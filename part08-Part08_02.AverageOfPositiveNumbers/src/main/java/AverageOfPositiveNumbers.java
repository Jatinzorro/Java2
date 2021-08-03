
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum=0;
        int count=0;
        while(true){
            int val=scanner.nextInt();
            if(val==0){
                break;
            }
            if(val>0){
                sum+=val;
                count++;
            }
        }
        if(sum>0){
            System.out.println(sum/count);
        }else{
            System.out.println("Cannot calculate the average");
        }

    }
}
