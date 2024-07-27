
import java.util.Scanner;
public class SumUsingDoWhile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int userInput;
        int count = 0;
        int userInputCounter = 0;
        do{
            System.out.println("enter an integer, enter 0 to stop");
            userInput = scanner.nextInt();
            userInputCounter ++ ;
            if (userInputCounter == 0)
            sum = sum + userInput;
            if(userInput <= 100){
            }
            else if(userInput > 100){
                count ++;
                 }
            }
            while (userInput != 0);
            System.out.println("sum = " + sum);

    }
}
