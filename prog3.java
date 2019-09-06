import java.util.*;
import java.io.*;
class prog3
{
    public static void main(String args[])
    {
        Scanner input =new Scanner(System.in);
        String s=input.nextLine();
        int i=0;
        int k=0;
        for(i=0;i<s.length();i++)
        {
            if((s.charAt(i)<'a' || s.charAt(i)>'z') && (s.charAt(i)<'A' || s.charAt(i)>'Z') )
            {
                k=1;
                break;
            }
        }
        if(k==1)
        {
            System.out.println("Error");
        }
        else{
            for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U'  )
            {
                System.out.print("Vowel ");
            }
            else 
            {
                System.out.print("Consonant ");
            }
        }
        }
    }
}