package VIT.Classwork;

import java.util.*;
public class Series_Sum
{
    public static void main()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Number of Terms:");
        int n = obj.nextInt();
        double s = 0;
        int i = 1;
        while(i<=n)
        {
            s+=1.0/i;
            i++;
        }
        System.out.println("Sum= "+s);
    }
}