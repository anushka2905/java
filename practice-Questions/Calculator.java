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
        System.out.println("5. Modulus");
        System.out.println("6. Exit");
        System.out.print("Select an option: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                performAddition(scanner);
                break;
            case 2:
                performSubtraction(scanner);
                break;
            case 3:
                performMultiplication(scanner);
                break;
            case 4:
                performDivision(scanner);
                break;
            case 5:
                performModulus(scanner);
                break;
            case 6:
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

private static void performAddition(Scanner scanner) {
    System.out.print("Enter first number: ");
    double num1 = scanner.nextDouble();
    System.out.print("Enter second number: ");
    double num2 = scanner.nextDouble();
    double result = num1 + num2;
    System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
}

private static void performSubtraction(Scanner scanner) {
    System.out.print("Enter first number: ");
    double num1 = scanner.nextDouble();
    System.out.print("Enter second number: ");
    double num2 = scanner.nextDouble();
    double result = num1 - num2;
    System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
}

private static void performMultiplication(Scanner scanner) {
    System.out.print("Enter first number: ");
    double num1 = scanner.nextDouble();
    System.out.print("Enter second number: ");
    double num2 = scanner.nextDouble();
    double result = num1 * num2;
    System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
}

private static void performDivision(Scanner scanner) {
    System.out.print("Enter first number: ");
    double num1 = scanner.nextDouble();
    System.out.print("Enter second number: ");
    double num2 = scanner.nextDouble();
    if (num2 != 0) {
        double result = num1 / num2;
        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
    } else {
        System.out.println("Error: Division by zero is not allowed.");
    }
}

private static void performModulus(Scanner scanner) {
    System.out.print("Enter first number: ");
    double num1 = scanner.nextDouble();
    System.out.print("Enter second number: ");
    double num2 = scanner.nextDouble();
    double result = num1 % num2;
    System.out.println("Result: " + num1 + " % " + num2 + " = " + result);
}
}
