//Write a program to accept length and breadth of rectangle from user. And calculate area and perimeter of rectangle. Display the result on console
import java.util.Scanner;
class AreaOfRectangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
         System.out.println("Enter length of rectangle: ");
         double length = scanner.nextDouble();
         System.out.println("Enter breadth of rectangle: ");
         double breadth = scanner.nextDouble();
        // calculate area of rectangle
        double area;
        area = length*breadth;
        System.out.println("Area = " + area);
        double perimeter;
        perimeter = 2*(length + breadth);
        System.out.println("Perimeter = " + perimeter);
   

    
    }
}
