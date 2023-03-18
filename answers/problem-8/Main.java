import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("size");
        int n,evenCounter=0,oddCounter=0,lastEvenIndex=0,lastOddIndex=0;
        n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++)
        {
            int num=sc.nextInt();//taking the numbers of the array
            if(num%2==0)
            {
                evenCounter++;//if the number was even then the even
               // counter increases
                lastEvenIndex=i+1;//and we make the index of even numbers
               // equals this index+1
            }
            else {
                oddCounter++;//if the number was odd then the odd counter
               // increases
                        lastOddIndex=i+1;//and we make the index of odd numbers
               // equals this index+1
            }
        }
        if(evenCounter<oddCounter)//if the odd numbers is more than even
            //numbers then the different number is even else the different number is odd
        {
            System.out.println(lastEvenIndex-1);//we print the index of the
           // even number
        }else System.out.println(lastOddIndex-1);//we print the index of the odd
       // number
    }
}