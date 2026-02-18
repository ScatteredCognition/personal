//task01
import java.util.Scanner;

public class task01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // setup
        int small = 0;
        int big = 0;
        int primec = 0;
        int pprimec = 0;
        if (a > b) {
            small = b;
            big = a;
        } else {
            small = a;
            big = b;
        }

        // main loop
        for (int i = small; i < big; i++) {
            // see if divisible
            boolean div = false;
            for (int j = 2; j < i - 1; j++) {
                if (i % j != 0) {
                    continue;
                } else {
                    div = true;
                }
            }
            
            // if no div happened
            if (div == false) {
                primec++;
            }
        }

        //print result
        System.out.println(
            "There are " + primec + " prime numbers between " + small + " and " + big
        );
    }
}
