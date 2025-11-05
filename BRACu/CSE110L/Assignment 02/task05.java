// task 05
import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the amount the customer need to pay(Taka): ");
        int bill = scn.nextInt();
        System.out.print("Enter the amount, customer gave(Taka): ");
        int paid = scn.nextInt();

        // Calculate ret
        int ret = paid - bill;
        int note_100 = 0;
        int note_50 = 0;
        int note_20 = 0;
        int note_10 = 0;
        int coin_5 = 0;
        int coin_2 = 0;
        int coin_1 = 0;

        if(ret < 0){
            System.out.println("Please pay " + (-1 * ret) + " taka more.");
        } else if(ret == 0){
            System.out.println("The returned amount is 0 taka.");
        } else {
            System.out.println("The returned amount is " + ret + " taka.");
            while(ret > 0){
                while(ret >= 100){
                    note_100 = note_100 + 1;
                    ret = ret - 100;
                }
                while(ret >= 50){
                    note_50 = note_50 + 1;
                    ret = ret - 50;
                }
                while(ret >= 20){
                    note_20 = note_20 + 1;
                    ret = ret - 20;
                }
                while(ret >= 10){
                    note_10 = note_10 + 1;
                    ret = ret - 10;
                }
                while(ret >= 5){
                    coin_5 = coin_5 + 1;
                    ret = ret - 5;
                }
                while(ret >= 2){
                    coin_2 = coin_2 + 1;
                    ret = ret - 2;
                }
                while(ret >= 1){
                    coin_1 = coin_1 + 1;
                    ret = ret - 1;
                }
            }

            System.out.println("100 taka note: " + note_100);
            System.out.println("50 taka note: " + note_50);
            System.out.println("20 taka note: " + note_20);
            System.out.println("10 taka note: " + note_10);
            System.out.println("5 taka coin: " + coin_5);
            System.out.println("2 taka coin: " + coin_2);
            System.out.println("1 taka coin: " + coin_1);
        }
    }
}