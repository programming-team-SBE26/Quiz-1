import javax.swing.plaf.metal.MetalTheme;
import java.util.*;

class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] Args) {
        int upper =0, lower =0;
        System.out.println("Enter a word:");
        String word = scan.next();
        for(int i=0; i<word.length(); i++)
            if(word.charAt(i)>='A'&&word.charAt(i)<='Z')
                upper++;
            else
                lower++;
        if(upper>lower)
            System.out.println(word.toUpperCase());
        else if(upper<lower)
            System.out.println(word.toLowerCase());
        else
            System.out.println(word.toLowerCase());
    }
}