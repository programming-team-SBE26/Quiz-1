import javax.swing.plaf.metal.MetalTheme;
import java.util.*;

class Main {
    static Scanner scan = new Scanner(System.in);
    static boolean IsLucky(int number)
    {
        if(number <= 0)return false;
        while(number > 0)
        {
            if(number%10 != 4 && number%10 != 7)
                return false;
            number /= 10;
        }
        return true;
    }
    public static void main(String[] Args) {
        System.out.println("Enter L");
        int L = scan.nextInt();
        System.out.println("Enter R");
        int R = scan.nextInt();
        for(int i = L; i <= R ; i++)
        {
            if(IsLucky(i))
                System.out.println(i);
        }
    }

}
