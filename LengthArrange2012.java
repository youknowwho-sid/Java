package XII.StringBuffer;
import java.util.*;
public class LengthArrange2012
{
    String s;    
    public void LengthArrange2012()
    {    
        Scanner obj = new Scanner(System.in);        
        System.out.println("Enter Sentence");
        do
        {
            s=obj.nextLine();
            if(checkSentence()==true)
            {
                break;
            }
        }while(true);
        System.out.println("The Number Of Words = "+countWords());
        orderAlphabetical();
        sentenceAlphabetical();
    }

    public static void main()
    {
        LengthArrange2012 ob = new LengthArrange2012();
        ob.LengthArrange2012();
    }
    
    public boolean checkSentence()
    {       
        for(int i = 0;i<s.length()-1;i++)
        {
            char ch1=s.charAt(i);
            char ch2= s.charAt(i+1);
            if(ch1==' ' && ch2!=' ')
            {
                continue;
            }
            else if(Character.isUpperCase(ch1))
            {
                continue;
            }           
            else
            {
                System.out.println("Re-enter Sentence");
                return false;                
            }
        }
        if (s.endsWith(".") ||s.endsWith("?") ||s.endsWith("!") ||s.endsWith(","))
        {
            return true;
        }
        else
        {
            System.out.println("Re-enter Sentence");
            return false;
        }
    }

    public int countWords()
    {
        StringTokenizer st = new StringTokenizer(s," ?.,!");
        int c = st.countTokens();
        return c;        
    }

    public String[] wordArray()
    {
        String arr[] = new String[countWords()];
        StringTokenizer st = new StringTokenizer(s," ?.,!");
        for(int i = 0;i<arr.length;i++)
        {
            arr[i]=st.nextToken();
        }
        return arr;
    }

    public String rearrangeAlphabeticalWord(String str)
    {
        String temp="";
        for (char x = 'A';x<='Z';x++)
        {
            for(int i = 0;i<str.length();i++)
            {
                if(str.charAt(i)==x)
                {
                    temp+= x;
                }
            }
        }
        return temp;
    }

    public void orderAlphabetical()
    {
        String arr[] = wordArray();
        String t=""; String str1="";
        for(int i = 0;i<arr.length;i++)
        {
            for(int j = 0;j<arr.length-1-i;i++)
            {
                if((arr[j].compareTo(arr[j+1]))>0)
                {
                    t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }            
        }
        for(int i = 0;i<arr.length;i++)
        {
            if(i!=arr.length-1)
            {
                System.out.print(arr[i]+" ");
            }    
            else
            {
                System.out.println(arr[i]+s.charAt(s.length()-1));
            }
        }
    }

    public void sentenceAlphabetical()
    {
        String arr[] = wordArray();
        String s1="";
        for(int i = 0;i<arr.length;i++)
        {
            s1+=rearrangeAlphabeticalWord(arr[i])+" ";
        }
        s1=s1.trim()+s.charAt(s.length()-1);
        System.out.println(s1);
    }
}
