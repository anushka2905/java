// wap to adcept marks of 3 subjects from user based on condition print the grade scored.
// condition grade A if the percentage is above 90
// grade B if percentage above 80
// grade C if percentage above 70
// grade D if percentage above 60
// for all other percentages print npo grade allcated
// programming instruction: use proper class name
// use proper and meaning full names for variables
// use proper spacing
import java.util.Scanner;
class StudentResult {
    public static void main(String[] args){
        // scanner class object initialized
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks of chemistry:");
        double chemistryMarks = scanner.nextDouble();
        System.out.println("Enter marks of physics:");
        double physicsMarks = scanner.nextDouble();
        System.out.println("Enter marks of maths:");
        double mathsMarks = scanner.nextDouble();
        // calculate avg marks
        double avgMarks;
        avgMarks = (chemistryMarks + physicsMarks + mathsMarks)/ 3;
        // conditional statement 
        if(avgMarks >= 90 && avgMarks <= 100){
            System.out.println("AvgMarks: " + avgMarks);
            System.out.println("You have scored grade A");
         }
         else if(avgMarks >= 80 && avgMarks <= 90){
            System.out.println("AvgMarks: " + avgMarks);
            System.out.println("You have scored grade B");
         }
        else if(avgMarks >= 70 && avgMarks <= 80){
                System.out.println("AvgMarks: " + avgMarks);
                System.out.println("You have scored grade C");
            }
        else if(avgMarks >= 60 && avgMarks <= 0){
                System.out.println("AvgMarks: " + avgMarks);
                System.out.println("You have scored grade D");

            }
    }
}
