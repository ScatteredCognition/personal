// task 05
import java.util.Scanner;

public class task05 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the N-digit vault code: ");
        int inp = scn.nextInt();
        int inp_orig = inp;
        int digit = 0;
        int done = 0;

        // Find out num of digits
        while(inp != 0){
            digit++;
            inp = inp/10;
            //System.out.println(digit);
        }

        int divider = 10;
        int mul = digit;
        //System.out.println(mul);

        // Generate divider for highest digit
        while(mul > 1){
            mul--;
            divider = 10 * divider;
            //System.out.println(divider);
        }

        // Account for divider being 10 initially
        divider = divider / 10;

        // Print single digits
        while(digit > 0){
            int d2 = (inp_orig - (inp_orig%divider))/divider;
            System.out.print(d2 + "... ");
            inp_orig = (inp_orig%divider);
            divider = divider / 10;
            digit--;
            mul++;
        }
    }
}