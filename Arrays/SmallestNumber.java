package Arrays;
import java.util.Scanner;
public class SmallestNumber {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        
            System.out.print("Enter the size of Array : ");
            int a=sc.nextInt();
            int[]arr=new int[a];
            System.out.print("Enter Array Elements: ");
            for(int i=0;i<arr.length;i++)
            {
                arr[i]=sc.nextInt();

            }
            sc.close();
            int min=Integer.MAX_VALUE;
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]<min)
                {
                   min=arr[i];
                }
            }
            System.out.print("SmallestNumber: "+min);
        
    }
    
}
