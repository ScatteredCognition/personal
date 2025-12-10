// task 03
import java.util.Scanner;

class task03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines to print: ");
        int lines = sc.nextInt();

        // Upper loop
        for(int i = 1; i <= lines; i++){

            int padding = lines - i;
            boolean mask = false;

            // Print spaces
            for(int j = 0; j < padding; j++){
                System.out.print(" ");
            }

            // Print number
            for(int k = 1; k <= i + (i - 1); k++){

                // set mask
                if((k != 1) && (k != (i + (i - 1))) && i != lines){
                    mask = true;
                } else {
                    mask = false;
                }

                //mask = false;
                if(mask == true){
                    System.out.print(" ");
                } else {
                    System.out.print(k);
                }
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