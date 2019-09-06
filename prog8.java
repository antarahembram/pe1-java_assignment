import java.util.*;
import java.io.*;
class prog8
{
    public static void main(String args[])
    {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a number between 1-100: ");
        int target=69;
        
        while(true)
        {
            int n=input.nextInt();
            if(n<target)
            {
                System.out.print("Number guessed is less than original number \n Enter again: ");
            }
            else if(n>target)
            {
                System.out.print("Number guessed is more than original number \n Enter again: ");
            }
            else
            {
                System.out.print("Number guessed matches original number ");
                break;
            }
        }
    }
}