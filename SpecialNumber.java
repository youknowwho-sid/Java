package X;

import java.util.*;
public class SpecialNumber
{
    public static void main()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = obj.nextInt();
        int k = a%10;
        int l = a/10;
        int s = k+l;
        int p = k*l;
        if (s+p == a)
        {
            System.out.println("Special number");
            System.out.print(s + " + " + p + " = " + a);
        }
        else 
        {
            System.out.println("Not a Special Number");
        }
    }
}
