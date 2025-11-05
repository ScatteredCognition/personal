// task 06
import java.util.Scanner;

public class task06 {
    public static void main(String[] args) {
        // Take num
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        // Check
        if ((num1 == num2) && (num2 == num3)) {
            System.out.println("All numbers are equal.");
        } else if ((num1 == num2) || (num2 == num3) || (num1 == num3)) {
            System.out.println("Neither all are equal nor different");
        } else {
            System.out.println("All numbers are different");
        }
    }
}