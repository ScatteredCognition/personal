//task02
import java.util.Scanner;

public class task02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine().toLowerCase();
        StringBuilder sb = new StringBuilder("");
        // main loop
        for (int i = 0; i < inp.length(); i++) {
            char ch = inp.charAt(i);
            if (ch == 'a') {
                sb.append("z");
            } else {
                sb.append((char) (ch - 1));
            }
        }
        // print result
        String out = sb.toString();
        System.out.println(out);
    }
}
