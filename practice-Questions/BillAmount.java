// Write a program that prompts the user to enter the total_bil_amount. If bill amount greater than or equal to 2000, calculate and print the final_bill_amount by giving 10 percent discount. If bill amount is less than 2000 then print No Discount.
import java.util.Scanner;
class BillAmount{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // print of bill amount
            System.out.println("Enter total bill amount:");
        double billAmount = scanner.nextDouble();
        // conditional statements
            if (billAmount >= 2000) {
                double finalBillAmount = billAmount * 0.90;
                System.out.println("The final_bill_amount by 10 percent discount:" + finalBillAmount);
            }
            else if(billAmount < 2000) {
                System.out.println("No discount");
            }


            
        // if discount given

    }
}
