//task 04
import java.util.Scanner;

public class task04 {

    public static int fibonacci(int n){
        if(n > 1){
            int result = fibonacci(n-1) + fibonacci(n - 2);
            return result;
        } else {
            return n;
        }
    }

    public static void main(String[] args){
        System.out.println(fibonacci(0));
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(9));
    }
}