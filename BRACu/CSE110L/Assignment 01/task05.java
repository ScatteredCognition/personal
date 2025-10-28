// task 05
public class task05 {
    public static void main(String[] args) {
        // Declare variables
        double a = 4.5;
        double b = 9.5;
        double c = Math.sqrt((a * a) + (b * b));
        System.out.println("Values of a, b, c are: " + a + ", " + b + ", " + c);

        // Calculate trigonmetric ratios
        double sinA = a / c;
        double cosA = b / c;
        double sinB = b / c;
        double cosB = a / c;
        System.out.println("Values of sinA, cosA, sinB, cosB are: " + sinA + ", " + cosA + ", " + sinB + ", " + cosB);
    }
}