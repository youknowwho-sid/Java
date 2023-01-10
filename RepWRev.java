package XII.StringBuffer;

import java.util.*;
public class RepWRev
{
    public static void RepWRev()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Sentence");
        StringBuffer sb=new StringBuffer(obj.nextLine());
        System.out.println("Original Sentence: " + sb);
        StringTokenizer st=new StringTokenizer(sb.toString());
        int c=st.countTokens();
        int j=0;
        while(sb.charAt(j)==' ')
            j++;
        main:
        for(int i=1; i<=c;i++)
        {
            String str=st.nextToken();
            StringBuffer temp = new StringBuffer(str);
            temp=temp.reverse();
            sb.replace(j,j+=temp.length(),temp.toString());
            if(j==sb.length())
            {
                break main;
            }
            while(sb.charAt(j)==' ')
            {
                j++;
                if(j==sb.length())
                {
                    break main;
                }
            }
        }
        System.out.println("Sentence after reversing words: "+sb);
    }
}
