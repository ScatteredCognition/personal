//task 03
import java.util.Scanner;

public class task03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Names of the spells: " + '\n');
        String[] spells = new String[1024];
        int spellsc = 0;
        int pow = 0;

        //take input
        while (true) {
            String inp = sc.nextLine();
            inp.trim();
            char[] inpAr = inp.toCharArray();
            char[] spellName = new char[inpAr.length];
            boolean validSpell = false;
            int spellNamec = 0;
            //if input is stop, break
            if (inp.equals("stop")) {
                break;
            }
            //filter name
            for (int i = 0; i <= (inpAr.length - 1); i++) {
                if (Character.isLetter(inpAr[i])) {
                    validSpell = true;
                    spellName[spellNamec] = inpAr[i];
                    spellNamec++;
                }
            }
            // add spellname to list if valid;
            if (validSpell == true) {
                spells[spellsc] = new String(spellName);
                spellsc++;
            }
        }

        //find longest spell
        int bigin = 0;
        int biginlen = 0;
        for (int i = 0; i < spells.length; i++) {
            String sp = spells[i];
            if (sp != null && sp.length() > biginlen) {
                biginlen = sp.length();
                bigin = i;
            }
        }

        //find power
        char[] powch = spells[bigin].toCharArray();
        for (int i = 0; i < powch.length; i++) {
            pow = pow + powch[i];
        }

        System.out.println("Largest Spell : " + spells[bigin].toUpperCase());
        System.out.println("Power Level : " + pow);
    }
}
