//package switch;
import java.util.Scanner;
public class DemoSwitch {
    public static void main(String[] args){
        //WAP to print name of day when user entered week day
        System.out.println("Select from below choice:");


        System.out.println("press 1 for first day of the week");
        System.out.println("press 2 for second day of the week");
        System.out.println("press 3 for third day of the week");
        System.out.println("press 4 for fourth day of the week");
        System.out.println("press 5 for fifth day of the week");
        System.out.println("press 6 for sixth day of the week");
        System.out.println("press 7 for seventh day of the week");
        System.out.println("press 0 to exit");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("Sunday");
            case 2:
                System.out.println("Monday");
            case 3:
                System.out.println("Tuesday");
            case 4:
                System.out.println("Wednesday");
            case 5:
                System.out.println("Thursday");
            case 6:
                 System.out.println("Friday");
            case 7:
                System.out.println("Saturday");
            case 0:
                System.out.println("Exciting....");
            default:
                System.out.println("Invalid choice");
        }
        
    }
    
}
