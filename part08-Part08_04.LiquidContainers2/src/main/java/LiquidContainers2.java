
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer=new Container();
        Container secondContainer=new Container();

        while (true) {
            System.out.print("First: "+firstContainer+"\n"
                            +"Second"+secondContainer+"\n");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts=input.split(" ");
            String command=parts[0];
            int amount=Integer.valueOf(parts[1]);
            
            switch(command){
                case "add":
                    firstContainer.add(amount);
                    break;
                case "move":
                    if(amount<=0 || firstContainer.contains()==0){
                        return;
                    }
                    if(firstContainer.contains()-amount<0){
                        amount=firstContainer.contains();
                    }
                    firstContainer.remove(amount);
                    secondContainer.add(amount);
                    break;
                case "remove":
                    secondContainer.remove(amount);
                    break;
                default:
                    System.out.println("Unknown command");
            }
            
        }
    }

}
