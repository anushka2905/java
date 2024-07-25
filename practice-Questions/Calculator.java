// Design and implement an interactive calculator that provides a menu-driven interface for users to select and perform various mathematical operations.
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        System.out.println("Select from below choice:");

        System.out.println("press 1 for addition of numbers");
        System.out.println("press 2 for ssubtraction of numbers");
        System.out.println("press 3 for multiplication of numbers");
        System.out.println("press 4 division of numbers");
        System.out.println("press 5 to exit");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("number 1:");
                System.out.println("number 2:");
            case 2:
                System.out.println("number 1");
                System.out.println("number 2");
            case 3:
                System.out.println("number 1");
                System.out.println("number 2");   
            case 4:
                System.out.println("number 1");
                System.out.println("number 2");     
            }
    }
}
