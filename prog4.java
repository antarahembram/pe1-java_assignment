import java.util.*;
import java.io.*;
class prog4
{
    public static void main(String args[])
    {
        Scanner input =new Scanner(System.in);
        long n=input.nextLong();
        int i=1;
        while(i<=n)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(i+" ");
            }
            i++;
        }
    }
}