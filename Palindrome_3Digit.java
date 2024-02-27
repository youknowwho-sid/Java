package VIT.Classwork;
import java.util.*;
public class Palindrome_3Digit
{
    public static void Palindrome_3Digit()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter 3 digit number:");
        int n = obj.nextInt();
        if((n>99 && n<1000) == false)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            int t = n;
            int n1 = 0;
            while(t!=0)
            {
                int r = t%10;
                n1 = r + n1*10;
                t/=10;
            }
            if(n1==n)
            {
                System.out.println("Number is Palindrome");
            }
            else
            {
                System.out.println("Number is not Palindrome");
            }
        }
    }
}