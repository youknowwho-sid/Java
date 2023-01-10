package XII.StringBuffer;

import java.util.*;
public class SB_Reverse
{
    public static void SB_Reverse()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Sentence");
        StringBuffer sb = new StringBuffer(obj.nextLine());
        StringTokenizer st = new StringTokenizer(sb.toString());
        int c = st.countTokens();
        for(int i = 1;i<=c;i++)
        {
            String str = st.nextToken();
            if(new StringBuffer(str).reverse().toString().equals(str))
            {
                System.out.println(str);
            }
        }
    }
}
