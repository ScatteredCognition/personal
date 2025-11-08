// task 04
import java.util.Scanner;

public class task04 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number: ");
        int inp = scn.nextInt();

        while(inp != 0){
            System.out.print( inp%10 + ", ");
            inp = inp/10;
        }
    }
}