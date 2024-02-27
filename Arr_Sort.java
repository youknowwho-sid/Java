package VIT.Classwork;
import java.util.*;
public class Arr_Sort
{
    public static void main()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int s = obj.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter Elements:");
        for(int i  = 0;i<arr.length;i++)
        {
            arr[i] = obj.nextInt();
        }
        int t;
        for(int i = 0;i <arr.length;i++)
        {
            for (int j = 0;j <arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        System.out.println("Array After Sorting:");
        for(int i  = 0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
