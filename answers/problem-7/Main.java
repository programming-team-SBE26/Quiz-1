import java.util.*;


class Main{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] Args){
        System.out.println("size");
        int Count =0;
        int MaxCount = 0 ;
        int MaxNum = 0;
        int Size = scan.nextInt();
        int[] Num = new int[Size];
        for (int i =0; i< Size ; i++){
            Num[i] = scan.nextInt();
        }
        for (int i = 0 ; i < Size ; i++){
            for (int j = i+1 ; j < Size ; j++){
                if (Num[i] == Num[j]){
                    Count ++ ;
                }
            }
            if (Count >= MaxCount){
                MaxCount = Count ;
                MaxNum = Num[i];
            }
            Count = 0;
        }
        System.out.println(MaxNum);
    }
}