import java.util.*;
import java.io.*;
class prog5
{
    public static void main(String args[])
    {
        Scanner input =new Scanner(System.in);
       int s=0;
       int i=0;
       int n;
       while(true)
       {
            int n=input.nextInt();
            s=s+n;
            i++;
	    System.out.println(i+" "+s);
       }
      
        
    }
}
