
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         Random ladyLuck = new Random();
        System.out.println("How many random numbers should be printed?");
        int lim=scanner.nextInt();
        for (int i = 0; i < lim; i++) {
            // Draw and print a random number
            
            System.out.println(ladyLuck.nextInt(11));
        }
    }

}
