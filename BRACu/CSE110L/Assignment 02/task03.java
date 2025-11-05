// task 03
import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        // Take input
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float num1 = scn.nextFloat();
        System.out.print("Enter second number: ");
        float num2 = scn.nextFloat();
        System.out.print("Enter third number: ");
        float num3 = scn.nextFloat();

        // Find largest
        if(num1 >= num2){
            if(num1 >= num3){
                System.out.println("Maximum number is: " + num1);
            } else {
                System.out.println("Maximum number is: " + num3);
            }
        } else if (num2 >= num3){
            System.out.println("Maximum number is: " + num2);
        } else {
            System.out.println("Maximum number is: " + num3);
        }

        // Find smallest
        if(num1 <= num2){
            if(num1 <= num3){
                System.out.println("Minimum number is: " + num1);
            } else {
                System.out.println("Minimum number is: " + num3);
            }
        } else if (num2 <= num3){
            System.out.println("Minimum number is: " + num2);
        } else {
            System.out.println("Minimum number is: " + num3);
        }
    }
}