//task05
import java.util.Scanner;

public class task05 {
    public static void main(String[] args){
        //given info
        int[] marks = {85, 90, 75, 44, 99};
        String[] names = {"Bob", "Alice", "Max", "Marry", "Rosy"};

        //sort arrays
        int min = 100;
        int mindex = 0;
        for(int i = 0; i < marks.length - 1; i++){
            for (int j = 0; j < marks.length - i - 1; j++){
                if(marks[j] > marks[j + 1]){
                    //assign temp
                    int tmk = marks[j];
                    String tnm = names[j];
                    //swap vars
                    marks[j] = marks[j+1];
                    names[j] = names[j+1];
                    marks[j+1] = tmk;
                    names[j+1] = tnm;
                }
            }
        }

        //display result
        System.out.println("Sorted Array: ");
        for(int i = 0; i < marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println("");
        for(int i = 0; i < names.length; i++){
            System.out.print(names[i] + " ");
        }
    }
}