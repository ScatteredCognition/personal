// task 08
import java.util.Scanner;

public class task08 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num_count = scn.nextInt();
        int count = 0;
        int negnum = 0;
        int nnegnum = 0;
        while(count < num_count){
            count++;
            System.out.println("Enter number " + count + ": ");
            int inp = scn.nextInt();
            if(inp < 0){
                negnum++;
            } else {
                nnegnum++;
            }
        }

        System.out.println(nnegnum + " Non-negative Numbers");
        System.out.println(negnum + " Negative Numbers");
    }
}