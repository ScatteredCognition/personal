// task 03
import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        // Take input
        Scanner scn = new Scanner(System.in);
        int E = 0;
        int N = 0;
        int D = 0;
        int count = 0;
        int done = 0;
        System.out.print("Energy (E): ");
        E = scn.nextInt();
        System.out.print("Number of River (N): ");
        N = scn.nextInt();

        // Calculate and print
        while((N >= 0) && (done == 0)){
            if(N <= 0){
                System.out.println("All Done");
                System.out.println(E + " energy Left");
                done = 1;
            } else if((E < 0)) {
                System.out.println("Tired at River " + count);
                done = 1;
            }

            N--;
            count++;

            if(done == 0){
                System.out.println("Enter River Distance D" + count + " :");
                D = scn.nextInt();
                if(D <= 5){
                    E = E - 2;
                } else {
                    E = E - (D / 2);
                }
            }
        }
    }
}