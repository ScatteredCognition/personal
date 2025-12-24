//task04
import java.util.Scanner;

public class task04 {
    public static void main(String[] args){
        //take inp0ut
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of array 1: ");
        int count1 = sc.nextInt();

        //main loop
        System.out.println("Please enter the elements of the arr1:");
        double[] arr1 = new double[count1];
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = sc.nextDouble();
        }

        //arr2
        System.out.println("Please enter the length of array 2: ");
        int count2 = sc.nextInt();

        //main loop
        System.out.println("Please enter the elements of the arr2:");
        double[] arr2 = new double[count2];
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = sc.nextDouble();
        }

        //checkloop
        boolean nosub = false;
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] != arr2[j]){
                    nosub = true;
                }
            }

            if(nosub == true){
                System.out.println("Array 2 is not a subset of Array 1.");
                break;
            }
        }

        if(nosub == false){
            System.out.println("Array 2 is a subset of Array 1.");
        }
    }
}
