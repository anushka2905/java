
import java.util.Scanner;
public class SumUsingDoWhile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int userInput;
        do{
            System.out.println("enter an integer, enter 0 to stop");
            userInput = scanner.nextInt();
            sum = sum + userInput;
            }while (userInput != 0);
    }
}
