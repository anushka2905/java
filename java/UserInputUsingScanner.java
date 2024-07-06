import java.util.Scanner;
class UserInputUsingScanner {
    public static void main(String[] args){
        // create scanner class object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer value");
        int number1 = scanner.nextInt();
        System.out.println("Enter the room temperature");
        float temperature = scanner.nextFloat();
        
    }
}
