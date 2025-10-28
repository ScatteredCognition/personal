// task 01
import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        // Take input
        System.out.println("Please enter your time (in minutes): ");
        Scanner scn = new Scanner(System.in);
        int minutes = scn.nextInt();

        // Convert
        if(minutes >= 0){
            int days = minutes / (24 * 60);
            int years = days / 365;
            int leftover_days = days % 365;

            if(leftover_days == 0){
                System.out.println("Converted time is: " + years + " years.");
            }
            else {
                System.out.println("Converted time is: " + years + " years and " + leftover_days + " days.");
            }
        }
        else {
            System.out.println("Please don't input negative values.");
        }
    }
}