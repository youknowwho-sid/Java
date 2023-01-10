package XII.StringBuffer;
import java.util.*;
public class VowelReplace
{
    public static void main()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a sentence...");
        StringBuffer sb=new StringBuffer(obj.nextLine());
        System.out.println("Original Sentence...   " + sb);
        for(int i=0; i<sb.length();i++)
        {
            char ch=sb.charAt(i);
            if(Character.isLetter(ch))
            {
                if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'||ch=='A' || ch=='E' ||ch=='I' ||ch=='O' ||ch=='U' )
                {

                }
                else
                {
                    sb.setCharAt(i,'*');
                }
            }
        }
        System.out.println("Sentence after replacing consonants with * ...   "+sb);
    }
}