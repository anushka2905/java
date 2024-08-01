// Design and implement an interactive calculator that provides a menu-driven interface for users to select and perform various mathematical operations.
import java.util.Scanner;

 class Calculator {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean exit = false;

    while (!exit) {
        System.out.println("Menu-driven Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        System.out.print("Select an option: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
           double performAddition;
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();
                double result = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                break;
            case 2:
               double performSubtraction;
                System.out.print("Enter first number: ");
                 num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                 num2 = scanner.nextDouble();
                 result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                break;
            case 3:
               double performMultiplication;
                System.out.print("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                 num2 = scanner.nextDouble();
                 result = num1 * num2;
                 
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                break;
            case 4:
               double performDivision;
                System.out.print("Enter first number: ");
                 num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                 num2 = scanner.nextDouble();
                if (num2 != 0) {
                  result = num1 / num2;
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case 5:
                exit = true;
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
                break;
        }
    }

    scanner.close();
}

 }
