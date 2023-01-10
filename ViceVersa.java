package XII.StringBuffer;

import java.util.*;
public class ViceVersa
{
    public static void ViceVersa()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter String");
        StringBuffer sb = new StringBuffer(obj.nextLine());
        for(int i =0;i<sb.length();i++)
        {
            char ch = sb.charAt(i);
            if(Character.isUpperCase(ch))
            {
                sb.setCharAt(i,Character.toLowerCase(ch));
            }
            else if(Character.isLowerCase(ch))
            {
                sb.setCharAt(i,Character.toUpperCase(ch));
            }
        }
        System.out.println(sb);
    }
}
