// task 01
import java.util.Scanner;

public class task01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int inp = sc.nextInt();
        int digit = 0;
        int sum = 0;

        // Operate on idividual digits
        for(int i = 1; inp/i != 0; i *= 10){
            // calculate digit
            digit = ( ( inp%( i*10 ) ) - ( inp%i ) );
            if(digit >= 10){
                digit = digit/i;
            }
            // make sum
            sum += digit*digit*digit;
        }

        // print result
        if(sum == inp){
            System.out.println(inp + " is an Armstrong number.");
        } else {
            System.out.println(inp + " is not an Armstrong number.");
        }
    }
}