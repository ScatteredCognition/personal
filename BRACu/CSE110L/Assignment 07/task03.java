//task03
import java.util.Scanner;

public class task03 {
    public static void main(String[] args){
        //take inp0ut
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int count = sc.nextInt();

        //main loop
        double[] nums = new double[count];
        for(int i = 0; i < nums.length; i++){
            System.out.println("Enter a number: ");
            nums[i] = sc.nextDouble();
        }

        //search loop
        double max = 0;
        int maxin = 0;
        double min = 0;
        int minin = 0;
        double sum = 0;
        double avg = 0;

        for(int i = 0; i < nums.length; i++){
            //find max
            if(nums[i] > max){
                max = nums[i];
                maxin = i;
            }

            //find min
            if(nums[i] < min){
                min = nums[i];
                minin = i;
            }

            //find sum
            sum = sum + nums[i];
        }

        //find avg
        avg = sum / (double) nums.length;

        //display reesults
        System.out.println("Maximum element " + max + " found at index " + maxin);
        System.out.println("Minimum element " + min + " found at index " + minin);
        System.out.println("Summation: " + sum);
        System.out.println("Average: " + avg);
    }
}
