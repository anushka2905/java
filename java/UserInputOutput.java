// for taking user input we will use library class (scanner)
// class scanner which is coming from pakage 
// java.util
// to add this class in our program we will use input statement
// import statements are placed above class 
// declaration
import java.util.Scanner; 
class UserInputOutput {
    public static void main(String[] args){
        //step 3
        int number1;
        double number2;
        //step 4 Scanner class object declare and initalize
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.next();
        //next()
        //nextLine();
        System.out.println("Name = " + name);
    }
}
