// task 02
import java.util.Scanner;

public class task02 {

    public static int power(int n, int m){

        int result = 1;
        for(int p = m; p > 0; p--){
            result = result * n;
        }

        return result;
    }

    public static void main(String[] args){
        int x = power(5,3);
        System.out.println(x);

        x = power(8,4);
        System.out.println(x);
    }
}