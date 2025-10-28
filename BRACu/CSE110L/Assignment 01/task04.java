// task 04
public class task04 {
    public static void main(String[] args) {
        // Declare variables
        int w = 13;
        int l = 10;
        System.out.println("Width and Length are: " + w + " and " + l);

        // Calculate diag
        double diag = Math.sqrt((w * w) + (l * l));
        System.out.println("Diagonal of the room is: " + diag);
    }
}