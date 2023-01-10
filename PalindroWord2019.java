package XII.StringBuffer;

import java.util.*;
public class PalindroWord2019
{
    String s;
    public void PalindroWord2019()
    {
        Scanner obj = new Scanner(System.in);        
        while(true)
        {
            System.out.println("Enter a Sentence");
            s = obj.nextLine();
            boolean b = checkSentence(s);
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
        System.out.println(makePalindrome());
    }

    public boolean checkSentence(String str)
    {        
        if(str.charAt(str.length()-1)!='.')
        {
            if(str.charAt(str.length()-1)!='!')
            {
                if(str.charAt(str.length()-1)!='?')
                {
                    return false;
                }
            }
        }     
        for(int i = 0;i<str.length()-1;i++)
        {
            if(str.charAt(i)==' ' && str.charAt(i+1)==' ')
            {
                return false;
            }
        }
        for(int i =0;i<str.length()-1;i++)
        {
            if((str.charAt(i)!=' '))
            {
                if(str.charAt(i)<91 && str.charAt(i)>64)
                {
                    continue;
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
    }

    public String makePalindrome()
    {
        String w,end,str="";
        char ch;
        ch=s.charAt(s.length()-1);
        String ns= s.substring(0,s.length()-1);
        StringTokenizer st = new StringTokenizer(ns);
        while(st.hasMoreTokens())
        {
            w=st.nextToken();
            int i=0;
            end="";
            while(!cP(w+end))
            {
                end = w.charAt(i) + end;
                i++;
            }
            str+= w + end + " ";
        }
        return str;
    }

    public boolean cP(String s1)
    {
        String str="";
        for(int i=0;i<s1.length();i++)
        {
            str=s1.charAt(i) + str;
        }
        return s1.equals(str);
    }
    
    public static void main()
    {
        PalindroWord2019 ob = new PalindroWord2019();
        ob.PalindroWord2019();
    }
}
