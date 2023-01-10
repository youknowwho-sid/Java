package XII.StringBuffer;
/** 
 * A program to accept a sentence and create a new sentence with the first and the last letter of each word 
 * swapped.
 * (The rest of the characters will remain unchanged).
 * Input : ISC Computer Science
 * Output : 
 * CSI romputeC eciencS */
import java.util.*;
public class FL_Swap
{
    public static void FL_Swap()
    {
        Scanner obj = new Scanner(System.in);        
        System.out.println("Enter a Sentence");
        StringBuffer sb=new StringBuffer(obj.nextLine());
        System.out.println("Original Sentence...   " + sb);
        StringTokenizer st=new StringTokenizer(sb.toString());
        int c=st.countTokens();
        int j=0;
        while(sb.charAt(j)==' ')
            j++;
        main:
        for(int i=1; i<=c;i++)
        {
            String str=st.nextToken();
            StringBuffer temp=new StringBuffer(str);
            char ch=temp.charAt(0);
            temp. setCharAt(0,temp.charAt(temp.length()-1));
            temp. setCharAt(temp.length()-1,ch);
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
        System.out.println("Sentence after swapping the first and the last letter of a word: "+sb);
    }
}
