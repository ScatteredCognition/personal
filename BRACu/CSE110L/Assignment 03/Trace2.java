public class Trace2 {
    public static void main(String[] args) {
        int x = 0, p = 0, sum = 0;
        p = 1;
        x = 2;
        double q = 0.0;
        sum = 5;
        while (p < 15) {
        	q = x + p - (sum + (int) (7 / 4)) / 3.0 % 2;
        	sum = sum + x + (int) q;
        	x += 1;
        	System.out.println(sum);
        	if (x > 5) {
            	p += (int) (5 / 2);
        	}
        	else {
            	p += 10 % 3;
        	}

            //System.out.println("q no." + (x-2) + " = " + q);
            //System.out.println("Sum no." + (x-2) + " = " + sum);
            //System.out.println("x no." + (x-2) + " = " + x);
            //System.out.println("p no." + (x-2) + " = " + p);
        }
        sum = sum + p;
        System.out.println(sum);
        //System.out.println("Sum final." + " = " + sum);
    }
}
