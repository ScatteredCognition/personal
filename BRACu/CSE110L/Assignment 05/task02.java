// task 02
import java.util.Scanner;

class task02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines to print: ");
        int lines = sc.nextInt();

        // Main loop
        for(int i = lines; i >= 0; i--){

            // Print
            int maskCount = 0;
            boolean mask = false;
            for(int k = 1; k <= lines; k++){

                // Determine mask
                if((i < lines - 2) && (i != 0) && ((k != lines) && (k != i+1))){ // mask from 3rd line, if not on last line, and not last char or current line val
                    mask = true;
                } else {
                    mask = false;
                }


                if(k > i) { // Only print num if padding has been applied
                    if(mask == true){ // if masked, print space
                        System.out.print(" ");
                    } else {
                        System.out.print(k);
                    }
                } else { // Padding else
                    System.out.print(" ");
                }
            }
            // Goto newline
            System.out.println("");
        }
    }
}