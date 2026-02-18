//task03
import java.util.Scanner;

public class task03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N = ");
        int N = sc.nextInt();
        int[] ar = new int[N];
        int[] oar = new int[N];
        for (int i = 0; i < N; i++) {
            ar[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (ar[i] == ar[j]) {
                    oar[i]++;
                }
            }
        }

        // print result
        for (int i = 0; i < N; i++) {
            boolean shown = false;
            for (int j = i; j >= 0; j--) {
                if (j == i) {
                    continue;
                } else if (ar[i] == ar[j]) {
                    shown = true;
                }
            }

            if (shown == false) {
                System.out.print(ar[i] + " - ");
                System.out.println(oar[i] + " times");
            }
        }
    }
}
