import java.util.*;
import java.io.*;
class prog2
{
    public static void main(String args[])
    {
        Scanner input =new Scanner(System.in);
        long n=input.nextLong();
        if(n>20 && n<30)
        {
            if(n%2==0)
            {
                System.out.println("Jerry");
            }
            else
            {
                System.out.println("Tom");
            }
        }
    }
}