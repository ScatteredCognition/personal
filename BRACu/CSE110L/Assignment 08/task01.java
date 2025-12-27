//task01
import java.util.Scanner;

public class task01 {
    public static boolean isPrime(int num){
        //calculates prime numbers based on prime nums upto 31
        boolean flag = true;
        int[] par = {2, 3, 4, 5, 7, 11, 13, 17, 19, 23, 29, 31};
        for(int i = 0; i < par.length - 1; i++){
            if((num % par[i] == 0) && (num != par[i])){
                flag = false;
            }
        }
        return flag;
    }

    public static boolean isPerfect(int num){
        //all known perfect numbers are even
        boolean flag = false;

        if(num % 2 == 1){
            return flag;
        }

        //otherwise, find  sum of dividers
        int divsum = 0;
        for(int i = 1; i < num; i++){
            if(num % i == 0){
                divsum += i;
            }
        }

        if(divsum == num){
            flag = true;
        }

        return flag;
    }

    public static int special_sum(int num){
        int sum = 0;
        for(int i = 1; i < num; i++){

            if(isPrime(i) == true){
                sum += i;
            }

            if(isPerfect(i) == true){
                sum += i;
            }

            //System.out.println("i = " + sum + " sum = " + sum + "prime, per" + isPrime(i) + isPerfect(i));
        }
        return sum;
    }

    public static void main(String[] args){
        boolean check = false; 
        check = isPrime(7);
        System.out.println("isPrime(7) = " + check);
        check = isPrime(15);
        System.out.println("isPrime(15) = " + check);
        check = isPerfect(6);
        System.out.println("isPerfect(6) = " + check);
        check = isPerfect(33);
        System.out.println("isPerfect(33) = " + check);
        int spsum = 0;
        spsum = special_sum(8);
        System.out.println("special_sum(8) = " + spsum);
    }
}