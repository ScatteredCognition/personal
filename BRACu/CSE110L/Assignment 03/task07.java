// task 07
import java.util.Scanner;

public class task07 {
    public static void main(String[] args){
        int num = 600;
        int count = 0;
        int sum = 0;
        while(count < num){
            count++;
            if(((count%7 == 0) || (count%9 == 0)) && !((count%7 == 0) && (count%9 == 0))){
                sum = sum + count;
            }
        }

        System.out.println("Sum: " + sum);
    }
}