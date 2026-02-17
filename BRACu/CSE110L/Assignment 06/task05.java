//task 05
import java.util.Scanner;

public class task05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String[] words = inp.split(" ");
        System.out.println(words[words.length - 1].length());
    }
}
