// task 06
import java.util.Scanner;

public class task06{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number: ");
        int inp = scn.nextInt();
        int divisor = 1;
        int done = 0;

        // Prime check
        while((divisor<inp) && (done == 0)){
            divisor++;
            //System.out.println("divisor " + divisor);
            if((inp%divisor == 0) && (inp != divisor)){
                System.out.println(inp + " is not a prime number.");
                done = 1;
            } else if(divisor == inp){
                System.out.println(inp + " is a prime number.");
            }
        }

        // Perfect check
        done = 0;
        int divsum = 1;
        int divisor2 = 1;
        while((divisor2<inp) && (done == 0)){
            divisor2++;
            //System.out.println("divisor2 " + divisor2);
            if((inp%divisor2 == 0) && (divisor2 != inp)){
                divsum = divsum + divisor2;
                //System.out.println("divsum " + divsum);
            }
        }
        if(divsum == inp){
            System.out.println(inp + " is a perfect number.");
        } else {
            System.out.println(inp + " is not a perfect number.");
        }
    }
}