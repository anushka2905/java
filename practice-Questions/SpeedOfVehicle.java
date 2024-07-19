// Write a program that prompts the user to enter the speed of a vehicle. If speed is less than 20, display too slow; if speed is greater than 80, display too fast; but alwyas display drive safe.
import java.util.Scanner;
/**
 * SpeedOfVehicle
 */
class SpeedOfVehicle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 
        // enter speed of vehicle
            System.out.println("Enter speed of vehicle");
            double SpeedOfVehicle = scanner.nextDouble();
        //conditional statements
            if (SpeedOfVehicle <= 20) {
                System.out.println("speed of vehicle is too slow");
            }
            else if (SpeedOfVehicle <=79) {
                System.out.println("Speed is normal");
            }
            else if(SpeedOfVehicle >= 80){
                System.out.println("Speed of vehicle is too fast");
            }
            System.out.println("Always drive safe");
    }
    
}