package XII.StringBuffer;

import java.util.*;
//Program to Remove vowels from Sentence
public class RemoveVowels
{
    public static void main()
    {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter a sentence...");
        StringBuffer sb=new StringBuffer(obj.nextLine());
        
        for(int i=0; i<sb.length();i++)
        {
            char ch=sb.charAt(i);
            ch=Character.toLowerCase(ch);
            if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' )
            {
                sb.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(sb);
    }
}