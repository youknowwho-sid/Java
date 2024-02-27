package VIT.Classwork;
import java.util.*;
public class Arr_Frequency
{
    public static void main()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int s = obj.nextInt();
        int arr[] = new int[s];
        int f = 0;
        System.out.println("Enter Elements:");
        for(int i  = 0;i<arr.length;i++)
        {
            arr[i] = obj.nextInt();
        }
        System.out.println("Enter Element to Count Frequency:");
        int ch = obj.nextInt();
        for(int i  = 0;i<arr.length;i++)
        {
            if(ch==arr[i])
                f++;
        }
        System.out.println("Frequency of Element = "+f);
    }
}