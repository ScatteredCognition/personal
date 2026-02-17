//task 02
import java.util.Scanner;

public class task02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text: ");
        String inp = sc.nextLine();
        inp = inp.trim();
        char[] inpAr = inp.toCharArray();
        char[] volAr = new char[inpAr.length];
        int volArc = 0;

        // find and store vowels
        for (int i = 0; i <= (inpAr.length - 1); i++) {
            char ch = inpAr[i];
            if (
                ch == 'a' ||
                ch == 'e' ||
                ch == 'i' ||
                ch == 'o' ||
                ch == 'u' ||
                ch == 'A' ||
                ch == 'E' ||
                ch == 'I' ||
                ch == 'O' ||
                ch == 'U'
            ) {
                volAr[volArc] = ch;
                volArc++;
            }
        }

        volArc = 0;

        // reverse vowels
        for (int i = (inpAr.length - 1); i >= 0; i--) {
            char ch = inpAr[i];
            if (
                ch == 'a' ||
                ch == 'e' ||
                ch == 'i' ||
                ch == 'o' ||
                ch == 'u' ||
                ch == 'A' ||
                ch == 'E' ||
                ch == 'I' ||
                ch == 'O' ||
                ch == 'U'
            ) {
                inpAr[i] = volAr[volArc];
                volArc++;
            }

            String outp = new String(inpAr);

            System.out.print(outp);
        }
    }
}
