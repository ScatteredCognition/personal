//task 01
import java.util.Scanner;

public class task01 {
    public static void main(String[] args){
        //Take count
        Scanner sc = new Scanner(System.in);
        System.out.println("N = ");
        int count = sc.nextInt();

        //input loop
        int[] nums = new int[count];
        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }

        //display input
        System.out.println("Original array:");
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }

        //display modified input
        System.out.println("After modifying:");
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }
    }
}