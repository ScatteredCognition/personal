// task 01
import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        // Take input
        Scanner scn = new Scanner(System.in);
        int inp = 0;
        while(inp <= 0) {
            System.out.print("Enter a positive number: ");
            inp = scn.nextInt();
            if (inp <= 0) {
                System.out.println("Invalid input. Please try again.");
            }
        }

        // Calculate and print
        int num = 0;
        while(num < inp){
            num++;
            if((num % 5 == 0) && (num % 3 != 0)){
                System.out.println(num);
            }
        }
    }
}