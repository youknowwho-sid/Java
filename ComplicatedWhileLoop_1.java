package X;

/*# Namrata + Sid */
import java.util.*;
public class ComplicatedWhileLoop_1
{
    public static void main()
    {
        Scanner obj = new Scanner(System.in);
        int i = 1;
        char k = 65;   
        while(true)
        {
            System.out.println("Enter A Number Between 1 to 26");
            int x = obj.nextInt();
            if (x>0 && x<27)
            {
                while (i<=x)
                {
                    System.out.println(k);
                    i++;
                    k++;
                }
            }
            else
            {
                System.out.println("Between 1 to 26 Please..."); continue;
            } 
            break;
        }
    }
}

