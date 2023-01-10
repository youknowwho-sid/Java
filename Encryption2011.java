package XII.StringBuffer;
import java.util.*;
public class Encryption2011
{
    public static void Encryption2011()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Size Of The Array");
        int n = obj.nextInt(); obj.nextLine();
        String arr[] = new String[n];
        char ch;       
        System.out.println("Enter Sentence");
        for(int i = 0;i<arr.length;i++)
        {
            arr[i]=obj.nextLine();
            if(arr[i].endsWith("."))
            {
                ;
            }
            else
            {
                System.out.println("Re-Enter Sentence Ending With .");
                i--;
                continue;
            }
            if(i%2==0)
            {
                for(int x=0;x<arr[i].length();x++)
                {
                    ch=arr[i].charAt(x);
                    if(Character.isLetter(ch)==true)
                    {
                        if(ch=='Y')
                        {
                            arr[i]= arr[i].substring(0,x)+"A"+arr[i].substring(x+1);
                        }                        
                        else if(ch=='Z')
                        {
                            arr[i]= arr[i].substring(0,x)+"B"+arr[i].substring(x+1);
                        }
                        else if(ch=='z')
                        {
                            arr[i]= arr[i].substring(0,x)+"b"+arr[i].substring(x+1);
                        }
                        else if(ch=='y')
                        {
                            arr[i]= arr[i].substring(0,x)+"a"+arr[i].substring(x+1);
                        }
                        else
                        {                            
                            arr[i]= arr[i].substring(0,x)+((char)(ch+2))+arr[i].substring(x+1);
                        }
                    }
                }
            }
            else
            {
                StringTokenizer st = new StringTokenizer(arr[i]," .");
                String str="";
                int c = st.countTokens();
                for(int j=1;j<=c;j++)
                {
                    str = st.nextToken() + " " + str;
                }
                str=str.trim();
                str+=".";
                arr[i]=str;
            }
        } 
        for(int i = 0; i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
