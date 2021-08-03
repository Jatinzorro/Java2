
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jatin Sharma
 */
public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }
    
    public void start(){
        boolean loop=true;
        while(loop){
            System.out.println("Command: ");
            String input=scanner.nextLine();
            switch(input){
                case "stop":
                    loop=false;
                    break;
                case "add":
                    System.out.println("To add: ");
                    String wordToAdd=scanner.nextLine();
                    todoList.add(wordToAdd);
                    break;
                case "list":
                    todoList.print();
                    break;
                case "remove":
                    System.out.println("Which one is removed?");
                    int removeNumber=Integer.valueOf(scanner.nextLine());
                    todoList.remove(removeNumber);
                    break;
                default:
                    System.out.println("Unknown command");
            }
        }
    }
    
}
