import java.util.*;

public class Main{
    public static void main(String[] Args ){
        Scanner in = new Scanner (System.in);
        int PureSize = 0;
        //Take array from user
        System.out.println("Size");
        int Size = in.nextInt();

        int[] Num = new int[Size] ;
        int[] Pure = new int[Size];

        for (int i =0 ; i < Size ; i++){
            Num[i] = in.nextInt();
        }
        System.out.println();
        for (int i =0 ; i < Size ; i++){
            boolean Duplicate = false;
            for (int j = i+1 ; j< Size ; j++){
                if (Num[i] == Num[j]){
                    Duplicate = true;
                    break;
                }
            }
            if (!Duplicate){
                Pure[PureSize] = Num[i];
                PureSize ++ ;
            }
        }
        for (int i = 0 ; i < PureSize ; i++){
            System.out.print(Pure[i] + " ");
        }
    }
}