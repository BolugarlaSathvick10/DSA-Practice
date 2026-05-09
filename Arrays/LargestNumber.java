package Arryas;

import java.util.Scanner;
public class LargestNumber{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int a=sc.nextInt();
        int[]arr=new int[a];
        System.out.print("Enter array elements:");
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }

        }
    System.out.print(max);
    }
}