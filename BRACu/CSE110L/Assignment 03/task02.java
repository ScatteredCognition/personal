// task 02
import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        // Take input
        Scanner scn = new Scanner(System.in);
        int H = 0;
        int C = 0;
        System.out.println("Please Enter number of Herbs (H): ");
        H = scn.nextInt();
        System.out.println("Please Enter number of Crystals (C): ");
        C = scn.nextInt();

        // Calculate and print
        int done = 0;
        int potion = 0;
        while(done == 0){
            if(H >= 3 && C >= 2){
                H = H - 3;
                C = C - 2;
                potion++;
                System.out.println("Potion-" + potion + " created");
                System.out.println("Remaining Herbs: " + H + ", Remaining Crystals: " + C);
            } else {
                System.out.println("Potions Created: " + potion);
                if((potion % 2) == 0){
                    System.out.println("Stable Brew");
                    done = 1;
                } else {
                    System.out.println("Volatile Elixir");
                    done = 1;
                }
            }
        }
    }
}