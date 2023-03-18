import javax.swing.plaf.metal.MetalTheme;
import java.util.*;

class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] Args) {
        System.out.println("Enter the size");
        int size = scan.nextInt();
        int []arr = new int[size];
        int  count_even = 0 ;
        int count_negative = 0;
        System.out.println("Enter the elements");
        for(int i : arr)
        {
            i = scan.nextInt();
            if(i % 2 == 0)
                count_even++;
            if(i < 0)
                count_negative++;
        }
        System.out.println("even: " + count_even);
        System.out.println("negative: "+ count_negative);
    }

}