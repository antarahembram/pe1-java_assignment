import java.util.*;
import java.io.*;
class prog9
{
    public static void main(String args[])
    {
        Scanner input =new Scanner(System.in);
        String s=input.nextLine();
        int i;
        int n=s.length();
        String str="";
      //  char[] chararr=s.toCharArray();
        for(i=n-1;i>=0;i--)
        {
           str=str+s.charAt(i);
           

        }
        
      //  String str=chararr.toString();

        System.out.println(str);
    }
}