// task 01
import java.util.Scanner;

public class task01 {

    public static int factorial(int n){
        if(n > 1){
            n = n * factorial(n - 1);
            return n;
        }

        return n;
    }

    public static void main(String[] args){
        int n = 5;
        int x = factorial(n);
        System.out.println(x);

        n = 7;
        x = factorial(n);
        System.out.println(x);
    }
}