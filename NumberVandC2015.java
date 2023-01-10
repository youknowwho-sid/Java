package XII.StringBuffer;

import java.util.*;
public class NumberVandC2015
{
    String s="";
    public void NumberVandC2015()
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
        String s1="";
        StringTokenizer st = new StringTokenizer(s," .?");
        int c = st.countTokens();
        int i = 1;
        while(i<=c)
        {
            s1+=upperCase(st.nextToken())+" ";
            i++;    
        }
        System.out.println(s1);
        i=1;
        st = new StringTokenizer(s1," .?");
        System.out.println("Word\tVowels\tConsonants");
        while(i<=c)
        {
            VCcount(st.nextToken());
            i++;
        }
    }

    public boolean checkSentence(String str)
    {
        if(str.charAt(str.length()-1)!='.')
        {
            if(str.charAt(str.length()-1)!='?')
            {
                return false;
            }
        }
        for(int i = 0;i<str.length()-1;i++)
        {
            if(str.charAt(i)==' ' && str.charAt(i+1)==' ')
            {
                return false;
            }
        }
        StringTokenizer st = new StringTokenizer(str," .?");
        while(st.hasMoreTokens())
        {
            if(st.nextToken().length()>15)
            {
                return false;
            }
        }
        return true;
    }

    public String upperCase(String str)
    {
        char ch= Character.toUpperCase(str.charAt(0));
        str=ch+str.substring(1);
        return str;
    }
    
    public void VCcount(String str) 
    {
        int vcount = 0, ccount = 0;
        String str1 = str.toLowerCase();
        for(int i = 0; i < str1.length(); i++) 
        {
            char ch = str1.charAt(i); 
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
            { 
                vcount++; 
            } 
            else if((ch >= 'a'&& ch <= 'z')) 
            {
                ccount++;
            }
        }
        System.out.println(str+"\t"+vcount+"\t"+ccount);
    } 
    
    public static void main()
    {
        NumberVandC2015 ob = new NumberVandC2015();
        ob.NumberVandC2015();
    }
}

