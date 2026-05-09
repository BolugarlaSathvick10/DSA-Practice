package Arrays;
import java.util.Scanner;
public class Evencount {
    public static void main(String[] args) {
        {
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int []arr=new int[a];
            for(int i=0;i<a;i++)
            {
                arr[i]=sc.nextInt();
            }
            int evencount=0;
            int oddcount=0;
            for(int i=0;i<a;i++)
            {
                if(arr[i]%2==0)
                {
                    evencount++;
                }
                else{
                    oddcount++;
                }
            }
            System.out.println("Even Count: "+evencount);
            System.out.println("Odd Count: "+oddcount);
        }
    }

    
}
