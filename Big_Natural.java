package VIT.Classwork;
import java.util.*;
public class Big_Natural
{
    public static void Big_Natural()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Number of Terms:");
        int n = obj.nextInt();
        int f = 1;
        int max = 0;
        System.out.println("Enter Natural Numbers:");
        while(f<=n)
        {
            int n1 = obj.nextInt();
            if(n1<1)
            {
                System.out.println("Please Re-Enter Only Natural Numbers");
                continue;
            }
            if(n1>max)
                max = n1;
            f+=1;
        }     
        System.out.println("Maximum= "+max);        
    }
}