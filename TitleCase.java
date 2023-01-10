package XII.StringBuffer;
import java.util.*;
public class TitleCase
{
    public static void TitleCase()
    {
        Scanner obj = new Scanner(System.in);
        StringBuffer sb;
        int k = 0;
        test:        
        while(true)
        {
            System.out.println("Enter a Sentence in lowercase");
            sb = new StringBuffer(obj.nextLine());
            for(int i = 0;i<sb.length();i++)
            {
                if(Character.isUpperCase(sb.charAt(i)))
                {
                    continue test;
                }        
                else if(sb.charAt(i)==' ')
                {
                    ;
                }
            }
            break;
        }
        if(sb.charAt(0)!=' ')
        sb.insert(0," ");
        char ch;char ch1;
        for (int k1 = 0;k1<sb.length()-1;k1++)
        {
            ch=sb.charAt(k1);
            ch1=sb.charAt(k1+1);
            if(ch==' ' && Character.isLetter(ch1))
            {
                sb.replace(k1+1,k1+2,""+Character.toUpperCase(ch1));
            }
        }
        System.out.println(sb.deleteCharAt(0));
    }
}
