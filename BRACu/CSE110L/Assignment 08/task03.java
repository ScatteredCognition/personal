//task03
import java.util.Scanner;

public class task03 {

    public static double calcTax(int age, double sal){
        double tax = 0.0;

        if((age < 18) || (sal < 10000.0)){
            return tax;
        }

        if((sal >= 10000.0) && (sal <= 20000.0)){
            tax = sal * 0.07;
        }

        if(sal > 20000.0){
            tax = sal * 0.14;
        }

        return tax;
    }

    public static void calcYearlyTax(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to income tax calculator.");
        
        System.out.print("Enter your age: ");
        int agein = sc.nextInt();
        
        double[] month = new double[12];
        double sum = 0.0;
        for(int i = 0; i < (month.length - 1); i++){
            System.out.print("Enter your salary (month " + (i+1) + ") : ");
            double salin = sc.nextDouble();
            month[i] = calcTax(agein, salin);
            sum += month[i];
            System.out.println("Tax for month " + (i+1) + ": " + month[i]);
        }

        System.out.println("Total Yearly Tax: " + sum);

    }

    public static void main(String[] args){
        double t = 0.0;
        t = calcTax(16,20000);
        System.out.println("Age: 16, Salary: 20000, Tax: " + t);
        t = calcTax(20,18000);
        System.out.println("Age: 20, Salary: 18000, Tax: " + t);
        calcYearlyTax();
    }
}