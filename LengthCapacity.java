package XII.StringBuffer;
import java.util.*;
public class LengthCapacity
{
    public static void LengthCapacity()
    {
        Scanner obj=new Scanner(System.in);
        StringBuffer sb=new StringBuffer();
        System.out.println("The capacity of " + sb + " is  "+ sb.capacity());
        System.out.println("The length of " + sb + " is  "+ sb.length());
        System.out.println("Enter a sentence...");
        StringBuffer sb1=new StringBuffer(obj.nextLine());
        System.out.println("The capacity of " + sb1 + " is  "+ sb1.capacity());
        System.out.println("The length of " + sb1 + " is  "+ sb1.length());
        StringBuffer sb2=new StringBuffer(25);
        System.out.println("The capacity of " + sb2 + " is  "+ sb2.capacity());
        System.out.println("The length of " + sb2 + " is  "+ sb2.length());
        System.out.println("Enter a sentence...");
        sb2.insert(0,obj.nextLine());
        System.out.println("The capacity of " + sb2 + " is  "+ sb2.capacity());
        System.out.println("The length of " + sb2 + " is  "+ sb2.length());
        System.out.println("Enter a sentence...");
        sb2=new StringBuffer(obj.nextLine());//new memory allocated for sb2
        System.out.println("The capacity of " + sb2 + " is  "+ sb2.capacity());
        System.out.println("The length of " + sb2 + " is  "+ sb2.length());
    }
}
