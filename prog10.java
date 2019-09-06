import java.util.*;
import java.io.*;
class prog10
{
    public static void main(String args[])
    {
        Scanner input =new Scanner(System.in);
        String s=input.nextLine();
        int n=input.nextInt();
        int i;
        String str="";
        for(i=s.length()-n;i<s.length();i++)
        {
            str=str+s.charAt(i);
        }
        for(i=0;i<n;i++)
        {
            s=s+str;
        }
        System.out.print(s);

    }
}