package XII.StringBuffer;
import java.util.*;
public class Palindrome2013
{
    public static void Palindrome2013()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Sentence");  
        String s;
        L:
        while (true)
        {
            s = obj.nextLine();
            for(int i = 0;i<s.length()-1;i++)
            {
                char ch = s.charAt(i);
                char ch1= s.charAt(i+1);
                if(Character.isLowerCase(ch)||Character.isLowerCase(ch1))
                {
                    System.out.println("Re-Enter Uppercase Sentence");
                    continue L;
                }
                if(ch==' ' && ch1==' ')
                {
                    System.out.println("Re-Enter Sentence With Single Space");
                    continue L;
                }
                if(s.charAt(s.length()-1)!='.')
                {
                    if(s.charAt(s.length()-1)!='?')
                    {
                        if(s.charAt(s.length()-1)!='!')
                        {
                            if(s.charAt(s.length()-1)!=',')
                            {
                                System.out.println("Re-Enter Sentence");
                                continue L;
                            }
                        }
                    }
                }
            }
            break;
        }
        StringTokenizer st= new StringTokenizer(s," .,?!");
        int c = st.countTokens();
        int j =1;
        int ct=0;
        while(j<c+1)
        {
            String str=st.nextToken();
            if (isPalindrome(str)) 
            {    
                System.out.print(str+" "); ct++;
            }
            j++;
        }
        System.out.println("\nNumber of Palindrome words = "+ct);
    }

    public static boolean isPalindrome(String str) 
    { 
        int i = 0, j = str.length() - 1; 
        while (i < j)
        { 
            if (str.charAt(i) != str.charAt(j)) 
                return false;   
            i++; 
            j--; 
        }        
        return true; 
    }
}
