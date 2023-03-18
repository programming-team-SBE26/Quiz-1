import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[4];
        for(int i=0;i<4;i++)
        {
            arr[i]=sc.nextInt();//taking the four numbers from the user and
           // storing them in the array
        }
        Arrays.sort(arr);//sorting the array
        for(int i=0;i<3;i++)
        {
            System.out.print(arr[3]-arr[i] + " ");//the greatest number - the
            //other numbers
        } }
}