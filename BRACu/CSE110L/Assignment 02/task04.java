// task 04
import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {
        // Take input
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first side: ");
        int num1 = scn.nextInt();
        System.out.print("Enter second side: ");
        int num2 = scn.nextInt();
        System.out.print("Enter third side: ");
        int num3 = scn.nextInt();

        // Check for triangle type
        if((num1 == num2) && (num2 == num3)){
            System.out.println("This is a Equilateral Triangle");
        }
        else if(((num1 == num2) || (num2 == num3) || (num1 == num3)) && ((num1 != num2) || (num2 != num3) || (num1 != num3)) ){
            System.out.println("This is a Isosceles Triangle");
        }
        else {
            System.out.println("This is a Scalene Triangle");
        }

    }
}