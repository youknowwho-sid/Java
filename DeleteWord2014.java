package XII.StringBuffer;
import java.util.*;
public class DeleteWord2014
{
    public static void DelWord2014()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Sentence");  
        String s,str="";
        L:
        while (true)
        {
            s = obj.nextLine();
            for(int i = 0;i<s.length()-1;i++)
            {
                char ch = s.charAt(i);
                char ch1= s.charAt(i+1);
                if(Character.isLetter(ch)==false)
                {
                    if(ch==' ')
                    {
                        continue;
                    }
                    else
                    {
                        System.out.println("Re-Enter Sentence");    
                        continue L;                   
                    }
                }
                if(Character.isLowerCase(ch)||Character.isLowerCase(ch1))
                {
                    System.out.println("Re-Enter Uppercase Sentence");
                    continue L;
                }
                if(s.charAt(s.length()-1)!='.')
                {
                    if(s.charAt(s.length()-1)!='?')
                    { 
                        if(s.charAt(s.length()-1)!='!')
                        {
                            System.out.println("Re-Enter Sentence");
                            continue L;
                        }
                    }
                }
            }
            break;
        }
        StringTokenizer st = new StringTokenizer(s," .?!");
        int ct = st.countTokens();
        while(st.hasMoreTokens())
        {
            str+=st.nextToken().toString()+" "; 
        }
        str=str.trim();
        str+=s.charAt(s.length()-1);
        System.out.println(str);
        StringBuffer sb = new StringBuffer(str);
        StringTokenizer st1 = new StringTokenizer(str," .?!");
        System.out.println("Word To Be Deleted:");
        String s1= obj.nextLine();
        System.out.println("Word Position: ");
        int v=1;
        int h=0;
        int p= obj.nextInt(); obj.nextLine();
        while(h<str.length())
        {
            char cn = str.charAt(h);
            if(cn==' ')
                v++;
            if(v==p)
                break;
            h++;
        }
        str=(sb.replace(h,h+s1.length()+1,"")).toString();  
        System.out.println(str);
    }
}
//A    MORNING WALK IS A BLESSING   FOR THE DAY.