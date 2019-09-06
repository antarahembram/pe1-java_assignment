import java.util.*;
import java.io.*;
class prog6
{
    public static void main(String args[])
    {
        Scanner input =new Scanner(System.in);
        char s=input.next().charAt(0);
        int i;
        if(s>='A' && s<='Z')
        {
            System.out.println("Capital letter");
        }
        else if(s>='a' && s<='z')
        {
            System.out.println("Small case letter");
        }
        else if(s>='0' && s<='9')
        {
            System.out.println("Digit");
        }
        else
        {
            System.out.println("Special character");
        }
        

    }
}