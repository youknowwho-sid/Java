package XII.StringBuffer;

import java.util.*;
public class WordPotential2020
{    
    public void WordPotential2020()
    {
        Scanner obj = new Scanner(System.in);  
        String s;
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
        StringTokenizer str = new StringTokenizer(s," .,?!");
        int c = str.countTokens();         
        String w[] = new String[c];
        int p[] = new int[c];         
        for(int i=0; i<c; i++)
        {
            w[i] = str.nextToken(); 
            p[i] = findPot(w[i]); 
        }         
        for(int i=0; i<c; i++)
        {
            System.out.println(w[i]+"= "+p[i]);
        }                
        sortPot(w,p);
    }

    public boolean checkSentence(String str)
    {        
        if(str.charAt(str.length()-1)!='.')
        {
            if(str.charAt(str.length()-1)!='!')
            {
                if(str.charAt(str.length()-1)!='?')
                {
                    if(str.charAt(str.length()-1)!=',')
                    {
                        return false;
                    }
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
                if(Character.isUpperCase(str.charAt(i)))
                {
                    ;
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
    }

    public int findPot(String s) 
    {        
        int p = 0, l = s.length();
        char ch;
        for(int i=0; i<l; i++)
        {
            ch = s.charAt(i);
            p = p + (int)ch;
        }
        return p;
    }

    public void sortPot(String w[], int p[]) 
    {
        int t1 = 0;
        String t2 = "";         
        for(int i=0; i<p.length-1; i++)
        {
            for(int j=i+1; j<p.length; j++)
            {
                if(p[i]>p[j])
                {
                    t1 = p[i];
                    p[i] = p[j];
                    p[j] = t1;
                    t2 = w[i];
                    w[i] = w[j];
                    w[j] = t2;
                }
            }
        }         
        printResult(w,p);    
    }

    public void printResult(String w[], int p[]) 
    {        
        String s = "";
        for(int i=0; i<w.length; i++)
        {
            s = s + " " + w[i];
        }
        s = s.trim();
        System.out.println("Output: "+s);
    }     
}
