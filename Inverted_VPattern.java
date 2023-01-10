package X;

/**Sid*/
import java.util.Scanner;
public class Inverted_VPattern 
{
    public static void main() 
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the pattern to print : ");
        String p = obj.nextLine();
        System.out.print("Enter number of times it should get printed : ");
        int n = obj.nextInt();
        int B = n-1;
        int A = -1;
        System.out.print("\u000c");
        System.out.println();
        for(int i=1; i <= n; i++) 
        {
            for(int j=1; j <= B; j++) 
            { 
                System.out.print(" ");
            }
            System.out.print(p);
            for(int k=1; k <= A; k++) 
            { 
                System.out.print(" ");
            }
            if(i > 1) 
            { 
                System.out.print(p);
            }
            System.out.println();
            A = A + 2;
            B = B - 1;
        }   
    }
}