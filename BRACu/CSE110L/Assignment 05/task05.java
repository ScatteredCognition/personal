// task 05
import java.util.Scanner;

class task05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines to print: ");
        int lines = sc.nextInt();

        // Upper loop
        for(int i = 1; i <= lines; i++){

            int padding = lines - i;

            // Print spaces
            for(int j = 0; j < padding; j++){
                System.out.print(" ");
            }

            // Print loop
            for(int k = 1; k <= i; k++){
                System.out.print(k);
            }

            for(int k = i-1; k > 0; k--){
                System.out.print(k);
            }
            
            // Print spaces
            for(int j = 0; j < padding; j++){
                System.out.print(" ");
            }

            // Goto newline
            System.out.println("");
        }
    }
}