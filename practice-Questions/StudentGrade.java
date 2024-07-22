// WAP if student failed in any 1 sub dont calculate grade print u r fail
import java.util.Scanner;
class StudentGrade {
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks of chemistry:");
        double chemistryMarks = scanner.nextDouble();
        System.out.println("Enter marks of mathematics:");
        double mathematicsMarks = scanner.nextDouble();
        System.out.println("Enter marks of physics");
        double physicsMarks = scanner.nextDouble();
        double averageMarks;
        averageMarks = (chemistryMarks + physicsMarks + mathematicsMarks)/3;
        
        //conditions apply
        
       if(averageMarks > 90 && averageMarks <= 100){
            System.out.println("AverageMarks: " + averageMarks);
            System.out.println("You have scored grade A");
         }
         else if(averageMarks > 80 && averageMarks <= 90){
            System.out.println("AverageMarks: " + averageMarks);
            System.out.println("You have scored grade B");
         }
        else if(averageMarks > 70 && averageMarks <= 80){
                System.out.println("AverageMarks: " + averageMarks);
                System.out.println("You have scored grade C");
        }
        double marksOfAnyoneSubject = scanner.nextDouble();
       if (marksOfAnyoneSubject <= 32) {
            System.out.println("You have failed in one subject");
            System.out.println("Grade cannot be printed");
        }


    }
}
