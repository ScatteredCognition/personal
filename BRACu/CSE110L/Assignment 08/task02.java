//task02
import java.util.Scanner;

public class task02 {

    public static void showDots(int num){
        for(int i = 0; i < num; i++){
            System.out.print(".");
        }
        //System.out.println("");
    }

    public static void show_palindrome(int num){
        //start
        for(int i = 1; i <= num; i++){
            System.out.print(i);
        }
        //end
        for(int i = (num - 1); i > 0; i--){
            System.out.print(i);
        }
        //System.out.println("");
    }

    public static void showDiamond(int num){
        for(int i = 1; i <= num; i++){
            showDots(num - i);
            show_palindrome(i);
            showDots(num - i);
            System.out.println("");
        }

        for(int i = (num - 1); i > 0; i--){
            showDots(num - i);
            show_palindrome(i);
            showDots(num - i);
            System.out.println("");
        }
    }

    public static void main(String[] args){
        showDots(5);
        System.out.println("");
        showDots(3);
        System.out.println("");
        show_palindrome(5);
        System.out.println("");
        show_palindrome(3);
        System.out.println("");
        showDiamond(5);
        showDiamond(3);
    }
}