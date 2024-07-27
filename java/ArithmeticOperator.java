import java.util.Scanner;
class ArithmeticOperator {
    // WAP to accept circumference of a circle from the user and print radius of circle
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter circumference of circle:");
        double circumference = scanner.nextDouble();
        double radius;
        radius = (circumference/2*3.14);
        System.out.println("Radius of circle : "+radius);



    }
}

