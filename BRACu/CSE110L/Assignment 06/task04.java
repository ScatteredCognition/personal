//task 04
import java.util.Scanner;

public class task04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fan Message: ");
        String inp = sc.nextLine();
        inp = inp.trim();
        char[] inpAr = inp.toCharArray();
        int inpArc = 0;
        String[] words = inp.split(" ");

        //clean string
        for (int i = 0; i <= words.length - 1; i++) {
            String w = words[i];
            w
                .replace("!", "")
                .replace(",", "")
                .replace(".", "")
                .replace("?", "");
            words[i] = w;
        }

        //score points
        int madrid = 0;
        int city = 0;
        int close = 0;
        int destroy = 0;

        for (int i = 0; i <= words.length - 1; i++) {
            if (words[i].toLowerCase().equals("madrid")) {
                madrid++;
            }
            if (words[i].toLowerCase().equals("city")) {
                city++;
            }
            if (words[i].toLowerCase().equals("close")) {
                close++;
            }
            if (words[i].toLowerCase().equals("destroy")) {
                destroy++;
            }
        }

        //determine fan
        if (madrid > city) {
            System.out.println("Madrid Supporter");
        } else if (city > madrid) {
            System.out.println("City Supporter");
        } else {
            System.out.println("Neutral");
        }

        //determine outcome
        if (close > destroy) {
            System.out.println("Fan expect a close match");
        } else if (destroy > close) {
            System.out.println("Fan expects a dominating victory!");
        } else {
            System.out.println("Hard to read the fan sentiment");
        }
    }
}
