import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("size");
        int n=sc.nextInt(),max=0,lastNum=0,currentSeqLength=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();//taking the elements of the array
            if(arr[i]>=lastNum)
                currentSeqLength++;//if the current number is greater than the last one then increase the current sequence
            else
                currentSeqLength=1;//if not then we make a new sequence with only the current number

            if(currentSeqLength>max)
                max=currentSeqLength;//if the current sequence is greater than the maximum sequence then we make the current is the maximum

            lastNum=arr[i];//at the end of each loop make the last number = the current number to use in the next loop
        }
        System.out.println(max);
    }
}