 import java.util.Scanner;
    class ConditionalStatement {
    public static void main(String[] args){
        
    //creating an scanner object and initlializng it. also attaching the input source , i.e, console input.
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter an integer");
    // prompting the user to enter an input.
    int number = scanner.nextInt();
    //declared and initialised an variable from input string.
    //conditional execution
    if(number>100){
        System.out.println("Number = " + number);
    }
    System.out.println("Thank You");
}
    }

