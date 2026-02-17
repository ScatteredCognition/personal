//task 01
import java.util.Scanner;

public class task01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text: ");
        String inp = sc.nextLine();
        inp = inp.trim();
        int big = 0;

        for (int i = 0; i < (inp.length() - 1); i++) {
            char ch1 = inp.charAt(i);
            char ch2 = inp.charAt(i + 1);

            if (Character.isDigit(ch1) && Character.isDigit(ch2)) {
                int num = (ch1 - '0') * 10 + (ch2 - '0');
                if (num > big) {
                    big = num;
                }
            }
        }

        System.out.println("2-Digit PIN: " + big);
        Syste
    }
}
