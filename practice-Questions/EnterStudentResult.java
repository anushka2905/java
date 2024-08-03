// WAP that promts the user to enter the no. of students & each student name and score and finally display name of name of student with hightest marks
import java.util.Scanner;
public class EnterStudentResult {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int numberOfStudent = scanner.nextInt();
        scanner.nextLine();
        int nextScore = 0;
      
        String maxScoreName = null;

        for(int i = 1 ; i <= numberOfStudent ; i++){
            System.out.println("Enter number of students: ");
            String name = scanner.nextLine();
            System.out.println("Enter marks of student: ");
            int score = scanner.nextInt();
            int maxScore = scanner.nextInt();
            if (score > maxScore){
                maxScore = score;
                maxScoreName = name;
               
            }
        } 
     System.out.println("maxScoreName = " + maxScoreName);

        


    }

}
