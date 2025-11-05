// task 02
import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        // Take input
        Scanner scn = new Scanner(System.in);
        System.out.print("Age (years): ");
        int age = scn.nextInt();
        System.out.print("Energy consumed (kWh): ");
        int energy = scn.nextInt();

        // Calculate bill
        double rate = 15; // 15tk per kWh
        double bill = energy * rate; // initial bill

        if(age < 18){
            bill = bill * (1.0 - 0.2); // 20% discount
        } else if((age >= 18) && (age <= 60)){
            bill = bill; // no discount
        } else if(age > 60){
            bill = bill * (1.0 - 0.1); // 10% discount
        }

        if(energy > 100){
            bill = bill + (bill * 0.05); // 5% surcharge
        }

        // PRint bill
        System.out.println("Final bill: " + bill + " Taka");

    }
}