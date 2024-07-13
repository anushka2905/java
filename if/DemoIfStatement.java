import java.util.Scanner;
class DemoIfStatement{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int withdrawalAmount = scanner.nextInt();
        int balance = 5000;
        if( withdrawalAmount <= balance){
            System.out.println("Withdrawal permitted");
        }
        System.out.println("tysm");
    }
}
