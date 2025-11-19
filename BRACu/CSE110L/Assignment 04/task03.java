//task 03
import java.util.Scanner;

public class task03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of days");
        int days = sc.nextInt();

        for(int i = 1; i <= days; i++){
            System.out.println("Enter sales for Day " + i + ": ");
            double sale = 0;
            double tax = 0;

            for(int j = 0; j<3; j++){
                sale = sale + sc.nextDouble();
            }

            if(sale>=100){
                tax = sale*0.02;

                if(sale>=200){
                    tax = sale*0.05;

                    if(sale>=500){
                        tax = sale*0.10;
                    }
                }
            }

            System.out.println("Day " + i + ": Total Sales with Tax: " + (sale+tax));
        }
    }
}