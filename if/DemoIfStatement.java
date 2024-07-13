import java.util.scanner;
class DemoIfStatement{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int withdrawlAmount = scanner.nextInt();
        int balance = 5000;
        if(withdrawalAmount <= balance){
            System.out.printl("Withdrawal permitted");
        }
        System.out.println("tysm");
    }
}
