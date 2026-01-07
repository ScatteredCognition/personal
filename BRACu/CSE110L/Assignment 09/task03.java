// task 03
import java.util.Scanner;

public class task03 {

    public static void print_element(int[] n, int in){
        for(int p = in; p < n.length; p++){
            System.out.println(n[p]);
        }
    }

    public static void main(String[] args){
        int[] arr = {5,6,2,1,8,7};
        int index = 2;
        print_element(arr, index);

        int[] arr2 = {13,12,19,21,31,55};
        index = 0;
        print_element(arr2, index);
    }
}