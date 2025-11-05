// task 01
import java.util.Scanner;

public class task01 {
    public static void main(String[] args){
        // Take input
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number: ");
        int input = scn.nextInt();

        // Check input
        if((input % 5 == 0) && (input % 7 == 0)){
            System.out.println("Invalid: Divisible by both");
        } else if (input % 5 == 0){
            System.out.println("Divisible by 5 only");
        } else if (input % 7 == 0){
            System.out.println("Divisible by 7 only");
        } else {
            System.out.println("No");
        }
    }
}