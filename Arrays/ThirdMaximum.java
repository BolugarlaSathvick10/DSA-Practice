package Arrays;
import java.util.Scanner;
public class ThirdMaximum {
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
        if(arr.length==1)
        {
            System.out.print("ThirdMaximum: "+arr[0]);
        }
        if(arr.length==2)
        {
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
        System.out.println("third largest Number:  " +max1);

        }
        if(arr.length>2)
        {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        { 
            if(arr[i]>max1)
            {   
                max3=max2;
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2&&arr[i]!=max1)
            {   
                max3=max2;
                max2=arr[i];
            }
            else if(arr[i]>max3 && arr[i]<max2 && arr[i]!=max2)
            {
                max3=arr[i];
            }
        }
        System.out.println("First Maximum:  "+ max1);
        System.out.println("Second Maximum:  "+max2);
        System.out.println("third largest Number:  " +max3);
        sc.close();
      }
     
    }
    
}
