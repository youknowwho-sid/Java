package XII.StringBuffer;

import java.util.*;
public class CaesarCipher2017
{
    String s;
    public void CaesarCipher2017()
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
        caesarCipher(s);
    }

    public boolean checkSentence(String str)
    {
        if(str.length()<3||str.length()>100)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public void caesarCipher(String str)
    {
        for(int i = 0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(Character.isLetter(ch)==false)
            {
                continue;
            }
            else
            {
                if((ch>='a' && ch<='m')|| (ch>='A' && ch<='M'))
                {
                   s=s.substring(0,i)+(char)(ch+13)+s.substring(i+1);
                }
                else
                {                                        
                   s=s.substring(0,i)+(char)(ch-13)+s.substring(i+1);
                }
            }
        }
        System.out.println(s);
    }
}
