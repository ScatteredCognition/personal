// task 04
import java.util.Scanner;

class task04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines to print: ");
        int lines = sc.nextInt();
        boolean mask = false;

        // Upper loop
        for(int i = 1; i <= lines; i++){

            int padding = lines - i;

            // Print spaces
            for(int j = 0; j < padding; j++){
                System.out.print(" ");
            }

            // Print number
            for(int k = 1; k <= i + (i - 1); k++){
                // set mask
                if((k != 1) && (k != (i + (i - 1)))){
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

        // Lower loop
        for(int i = lines-1; i > 0; i--){

            int padding = lines - i;

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