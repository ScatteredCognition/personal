// task 03
public class task03 {
    public static void main(String[] args) {
        // Declare variables
        int sid = 1000054943;

        // Calculate the lat and second last digits
        int l01digit = sid - ((sid / 10) * 10);
        int l02digit = (sid - ((sid / 100) * 100)) / 10;
        System.out.println("Student ID is: " + sid);
        System.out.println("Last and 2nd last digits are: " + l01digit + " and " + l02digit);
        System.out.println("Last two digits reversed are: " + l01digit + "" + l02digit);
    }
}