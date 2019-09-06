import java.util.*;
import java.io.*;
class prog1
{
    public static void main(String args[])
    {
        Scanner input =new Scanner(System.in);
        long n=input.nextLong();
        long[] a=new long[20];
        int j=0;
        int i,k=0,ans=0;
        long sum=0;
        long m=n;
        while(n>0)
        {
            a[j]=n%10;
            j++;
            n=n/10;
        }
       
        for(i=0;i<j/2;i++)
        {
            if(a[i]!=a[j-i-1])
            {
                k=1;
                break;
            }
        }
        if(k==0)
        {
            for(i=0;i<j;i++)
            {
      //  System.out.println(a[i]);

                if(a[i]%2==0)
                {
                    sum=sum+a[i];
                }
            }
            if(sum>25)
            {
                k=2;
            }
        }
        switch(k)
        {
            case 0: System.out.println(m + " is a palindrome and the sum of even numbers is less than 25");
                    break;
            case 1: System.out.println(m + " is not a palindrome ");
                    break;
            case 2 :System.out.println(m + " is a palindrome and the sum of even numbers is greater than 25");
                    break;
        }
        //System.out.println(k);

    }
}