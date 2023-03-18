import javax.swing.plaf.metal.MetalTheme;
import java.util.*;

class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] Args) {
        int steps = 0;
        int[][] arr = new int[5][5];
        System.out.println("Please enter a matrix:");
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++) {
                arr[i][j] = scan.nextInt();
                if (arr[i][j] == 1)
                    steps += Math.abs(2 - i) + Math.abs(2 - j);
            }
        System.out.println("The number of needed steps is " + steps);
    }
}