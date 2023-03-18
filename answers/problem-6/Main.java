import java.util.*;

public class Main{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] Args ){
        System.out.println("size");
        int size = scan.nextInt();
        int []arr = new int[size];
        int idx_max = 0;
        for(int i = 0 ;i < size ; i++)// to get the index of the max element
        {
            arr[i] = scan.nextInt();
            if(arr[i] >= arr[idx_max])
            {
                idx_max= i;
            }
        }
        int idx_second_max; // initial value should not be the max element
        if(idx_max != size-1)idx_second_max = idx_max+1;
        else idx_second_max = idx_max-1;

        for(int i = 0 ;i < size ; i++)
        {
            if(arr[i] >= arr[idx_second_max]&& i != idx_max)
            {
                idx_second_max = i;
            }
        }
        System.out.println(arr[idx_second_max]);
    }
}