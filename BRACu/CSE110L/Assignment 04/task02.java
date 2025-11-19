// task 02
import java.util.Scanner;

public class task02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students to check: ");
        int scount = sc.nextInt();

        // take student id
        for(int i = 0; i<scount; i++){
            System.out.println("Enter student id: ");
            int sid = sc.nextInt();

            int sdiv = 0;
            int sidLucky=0;
            while(sdiv<=sid){
                if((sid == sdiv)||(sid == 1)){
                    System.out.println("Lucky ID");
                    sidLucky=1;
                    break;
                }
                
                //System.out.println("sdiv: " + sdiv);
                if(sdiv == 0){
                    sdiv = 2;
                } else {
                    sdiv = sdiv * 2;
                }
            }

            if(sidLucky == 0){
                System.out.println("Not Lucky ID");
            }
        }
    }
}