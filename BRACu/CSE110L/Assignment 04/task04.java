//task 04
import java.util.Scanner;

public class task04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Members: ");
        int mcount = sc.nextInt();

        for(int i = 1; i <= mcount; i++){
            System.out.println("Exercises for Member-" + i + ": ");
            int ecount = sc.nextInt();
            if(ecount > 3){
                System.out.println("(Can’t do more than 3 exercise)");
                ecount = 3;
            }
            double calorie = 0;
            double bonus = 0;

            for(int j = 1; j<= ecount; j++){
                System.out.println("Exercise-" + j + ": ");
                double curcal = sc.nextDouble();
                double curbon = 0;
                calorie += curcal;

                if(curcal<200){
                    curbon = curcal*-0.1;
                } else if(curcal > 350){
                    curbon = curcal*0.50;
                }
                
                //System.out.println(curbon);
                bonus += curbon;
            }

            double avg = ((calorie+bonus)/3);
            if(avg > 400){
                avg += 50;
            }

            System.out.println("Average calories earned per day for Member-" + i + ": " + avg);
        }
    }
}