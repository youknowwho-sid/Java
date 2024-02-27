package VIT.Classwork;
import java.util.*;
public class Factorial
{
    public static void Factorial()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = obj.nextInt();
        int f = 1;
        while(n>0)
        {
            f*=n;
            n-=1;
        }     
        System.out.println("Factorial= "+f);        
    }
}