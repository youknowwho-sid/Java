package XII.StringBuffer;

import java.util.*;
public class Paragraph2010
{
    public static void Paragraph()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Number of Sentences");
        int a = obj.nextInt(); obj.nextLine();
        int c=0;
        int k = 0;
        String s="",str="";
        if(a<1 || a>4)
        {
            System.out.println("Invalid Entry");
        }
        else
        {
            l1:
            while (k<=a)
            {
                System.out.println("Enter Sentences");                 
                s = obj.nextLine();
                L2:
                for(int j = 0;j<s.length()-1;j++)
                {
                    char ch1 = s.charAt(j);
                    char ch2 = s.charAt(j+1);
                    if ((s.charAt(s.length()-1)!='?') && (s.charAt(s.length()-1)!='.'))
                    {
                        System.out.println("Re-enter sentences");
                        continue l1;
                    }
                    if(Character.isLowerCase(ch1))
                    {
                        System.out.println("Re-enter sentences");
                        continue l1;
                    }
                    else if(ch1==' ' && ch2==' ')
                    {
                        System.out.println("Re-enter sentences");
                        continue l1;
                    }
                    else if(ch2=='?' || ch2=='.')
                    {
                        k++;
                    }
                }
                break;
            }
            StringTokenizer st = new StringTokenizer(s,"?., ");
            c+=st.countTokens();
            StringTokenizer st2= new StringTokenizer(s,"?.");
            int c2= st2.countTokens();
            if(c2==a)
            {               
                System.out.println("Number of Words= "+c);
                String arr[] = new String[c];
                int brr[] = new int[c];
                for(int v= 0;v<arr.length;v++)
                {
                    arr[v]=st.nextToken();
                }
                int c1=0;
                for(int i = 0;i<c;i++)
                {
                    if (arr[i]!=null)
                    {
                        c1=1;
                        for(int j = i+1;j<arr.length;j++)
                        {
                            if(arr[i].equals(arr[j]))
                            {
                                c1++;
                                arr[j]=null;
                            }
                        }                    
                    }
                    brr[i]=c1;
                }
                int t;
                String r="";
                for(int i = 0;i<brr.length;i++)
                {
                    for(int j = 0;j<brr.length-1-i;j++)
                    {
                        if(brr[j]<brr[j+1])
                        {
                            t=brr[j];
                            brr[j]=brr[j+1];
                            brr[j+1]=t;
                            r=arr[j];
                            arr[j]=arr[j+1];
                            arr[j+1]=r;
                        }
                    }
                }
                System.out.println("Words\tFrequency");
                for(int i = 0;i<c;i++)
                {
                    if(brr[i]>0 && arr[i]!=null)
                        System.out.println(arr[i]+"\t"+brr[i]);
                }
            }
            else
            {
                System.out.println("Invalid Entry");
            }
        }
    }
}
