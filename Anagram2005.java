package XII.StringBuffer;

import java.util.*;
public class Anagram2005
{
    String s;
    public void Anagram2005()
    {             
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a String");
        s = obj.nextLine();
        char arr[] = new char[s.length()];        
        for(int i = 0;i<arr.length;i++)
        {
            arr[i]=s.charAt(i);
        }
        Anagram(arr);
    }

    public void Anagram(char arr[])
    {
        int s = ((arr.length)*(arr.length+1))/2;
        int p = 1;
        int u  = arr.length;
        while(u>0)
        {
            p*=u;
            u--;
        }
        for(int i = (int)Math.pow(10,arr.length-1);i<((arr.length+1)*(int)(Math.pow(10,arr.length-1)));i++)
        {
            if(UniqueNumber(i))
            { 
                if(MaxDigit(i)<=arr.length)
                { 
                    if(SumNumber(i)==s)
                    { 
                        if(ProdNumber(i)==p)  
                            StringForm(i,arr);
                    }
                }
            }
        }            
    }

    public boolean UniqueNumber(int i)
    {
        int r1, r2, n, n1, n2, c = 0;
        n1 = i;
        n2 = i;
        while (n1>0)
        {
            r1=n1 % 10;
            if(r1==0)
                return false;
            while (n2>0)
            {
                r2=n2%10;
                if(r2==0)
                    return false;
                if (r1==r2)
                {
                    c++;
                }
                n2 = n2/10;
            }
            n1=n1/10;
        }
        if (c == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int MaxDigit(int i)
    {
        int max=0;
        for(int r;i!=0;i/=10)
        {
            r=i%10;
            if(r>max)
                max=r;
        }
        return max;
    }

    public int SumNumber(int i)
    {
        int sum=0;
        for(int r;i!=0;i/=10)
        {
            r=i%10;
            sum+=r;
        }
        return sum;
    }

    public int ProdNumber(int i)
    {
        int p=1;
        for(int r;i!=0;i/=10)
        {
            r=i%10;
            p*=r;
        }
        return p;
    }

    public void StringForm(int i,char arr[])
    {
        String str="";
        for(int r;i!=0;i/=10)
        {
            r=i%10;
            str+=arr[r-1];
        }
        System.out.println(str);
    }
}