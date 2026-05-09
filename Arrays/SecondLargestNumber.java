package Arrays;
import java.util.Scanner;
public class SecondLargestNumber {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int a=sc.nextInt();
        int[]arr=new int[a];
        System.out.print("Enter Array Elements: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        { 
            if(arr[i]>max1)
            {   
        
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2&&arr[i]!=max1)
            {   
            
                max2=arr[i];
            }
            
        }
        System.out.print("third largest Number:  " +max2);

    }
    
}
