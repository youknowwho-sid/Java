package VIT.Classwork;
import java.util.*;
public class Valid_Triangle
{
    public static void Valid_Triangle()
    { 
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter The Three Sides of The Triangle:");
        int a = obj.nextInt(); obj.nextLine();
        int b = obj.nextInt(); obj.nextLine();
        int c = obj.nextInt(); obj.nextLine();
        if((a+b)<c || (a+c)<b || (c+b)<a)
            System.out.println("Invalid Triangle");
        else
            System.out.println("Valid Triangle");
    }
}