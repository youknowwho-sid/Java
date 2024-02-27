package VIT.Classwork;
import java.util.*;
public class Prime
{
    public static void isPrime()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number");
        int x = obj.nextInt();
        int c = 0;
        for(int i =1;i<=x;i++) 
        {
            if(x%i==0)
                c++;            
        }
        if(c==2)
            System.out.println("True");
        else 
            System.out.println("False");
    }
}
