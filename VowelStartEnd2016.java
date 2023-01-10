package XII.StringBuffer;

import java.util.*;
public class VowelStartEnd2016
{
    String s="";
    public void VowelStartEnd2016()
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
        StringTokenizer st = new StringTokenizer(s," .!?");
        int c = st.countTokens();
        int i = 1;
        int wc=0;
        st = new StringTokenizer(s," .!?");
        while(i<=c)
        {
            wc+=VSE(st.nextToken());
            i++;
        }
        System.out.println("Number Of Words Starting And Ending With Vowels = "+wc);               
        reArrange();
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
            if(str.charAt(i)<91 && str.charAt(i)>64)
            {
                continue;
            }
            else
            {
                return false;
            }
        }
        return true;
    }

    public int VSE(String str)
    {
        char ch1=str.charAt(0);
        char ch2=str.charAt(str.length()-1);
        if(ch2=='A' || ch2=='E' || ch2=='I' || ch2=='O' || ch2=='U')
        {
            if(ch1=='A' || ch1=='E' || ch1=='I' || ch1=='O' || ch1=='U')
            {
                return 1;
            }
        }
        return 0;
    }

    public void reArrange()
    {
        StringTokenizer st = new StringTokenizer(s," .!?");
        String str="";        
        String s1 = "";
        String s2 = "";
        while(st.hasMoreTokens())
        {
            str=st.nextToken();
            char ch1=str.charAt(0);
            char ch2=str.charAt(str.length()-1);
            if(ch2=='A' || ch2=='E' || ch2=='I' || ch2=='O' || ch2=='U')
            {
                if(ch1=='A' || ch1=='E' || ch1=='I' || ch1=='O' || ch1=='U')
                {
                    s1+=str+ " ";
                }
            }
            else
            {
                s2+=str+" ";
            }       
        }
        System.out.println(s1+s2);
    }

    public static void main()
    {
        VowelStartEnd2016 ob = new VowelStartEnd2016();
        ob.VowelStartEnd2016();
    }
}
