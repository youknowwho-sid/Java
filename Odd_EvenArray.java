package VIT.Classwork;

import java.util.*;
public class Odd_EvenArray
{
    public static void main()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int s = obj.nextInt();
        int arr[] = new int[s];
        int ce = 0;
        int co = 0;        
        System.out.println("Enter Elements:");
        for(int i  = 0;i<arr.length;i++)
        {
            arr[i] = obj.nextInt();
        }
        for(int i  = 0;i<arr.length;i++)
        {
            if(arr[i]%2 == 0)
                ce++;
            else
                co++;
        }
        System.out.println("Number of Odd Elements = "+co);
        System.out.println("Number of Even Elements = "+ce);
    }
}