//task02
import java.util.Scanner;

public class task02 {
    public static void main(String[] args){
        //take inp0ut
        Scanner sc = new Scanner(System.in);
        System.out.println("N = ");
        int count = sc.nextInt();

        //main loop
        int[] nums = new int[count];
        for(int i = 0; i < nums.length; i++){
            System.out.println("Enter a number: ");
            nums[i] = sc.nextInt();
        }

        //search loop
        System.out.println("Enter a number: ");
        int src = sc.nextInt();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == src){
                System.out.println(src + " is at index " + i);
            }

            if(i == (nums.length - 1)){
                System.out.println("Element not found");
            }
        }
    }
}