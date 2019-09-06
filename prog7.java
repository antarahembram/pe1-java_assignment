import java.util.*;
import java.io.*;
class prog7
{
    public static void main(String args[])
    {
        Scanner input =new Scanner(System.in);
        int n=input.nextInt();
        int i,k=0;
        int[] a=new int[20];
        while(n>0)
        {
            a[k]=n%10;
            n=n/10;
            k++;
        }
        int j;
        for(i=0;i<(k-1);i++)
        {
            for(j=0;j<(k-i-1);j++)
            {
                if(a[j]<a[j+1])
                {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        int sum=0;
        System.out.print("Sorted number in non-increasing order: ");
        for(i=0;i<k;i++)
        {
            System.out.print(a[i]);
            if(a[i]%2==0){
                sum=sum+a[i];
            }
        }
        System.out.println();
        System.out.print("Sum of even numbers : ");
        System.out.println(sum);
        if(sum>15)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        
        

    }
}