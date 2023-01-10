package XII.StringBuffer;

import java.util.*;
public class VerticalPrint2018
{
    int N=0;
    public void VertPrint2018()
    {     
        Scanner obj = new Scanner(System.in);             
        while(true)
        {
            System.out.println("Enter Number of Teams");
            N = obj.nextInt(); obj.nextLine();
            boolean b = checkTeams(N);
            if(b==false)
            {
                System.out.println("Invalid Input");
                continue;
            }
            else
            {
                break;
            }
        }
        String arr[] = new String[N];
        int max = 0;
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print("Team "+(i+1)+": ");
            arr[i]= obj.nextLine();
            if(arr[i].length()>max)
                max= arr[i].length();
        }
        printArray(arr,max);
    }       

    public void printArray(String arr[], int max)
    {
        for(int i = 0;i<max;i++)
        {
            for (int j = 0;j<N;j++)
            {
                if(i < arr[j].length())
                {
                    System.out.print(arr[j].charAt(i)+"\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public boolean checkTeams(int c)
    {
        if(c<2 || c>9)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
