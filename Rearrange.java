package XII.StringBuffer;

import java.util.*;
public class Rearrange
{
    String wrd;
    String newwrd;
    public Rearrange() 
    {
        wrd = "";
        newwrd = "";
    }

    public void readword()  
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word:");
        wrd = sc.nextLine();
    }

    public void freq_vow_con()
    {
        wrd = wrd.toUpperCase();
        int v = 0;
        int c = 0;
        for(int i = 0; i<wrd.length(); i++) 
        {
            char ch = wrd.charAt(i);
            if(Character.isLetter(ch)) 
            {
                switch(ch) 
                {
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                    v++;
                    break;
                    default:
                    c++;
                }
            }
        }
        System.out.println("Frequency of vowels: "+v);
        System.out.println("Frequency of consonants: "+c);
    }

    public void arrange() 
    {
        String v = "";
        String c = "";
        wrd = wrd.toUpperCase();
        for(int i = 0; i < wrd. length(); i++)
        {
            char ch = wrd.charAt(i);
            if(Character.isLetter(ch)) 
            {
                switch(ch)
                {
                    case 'A':
                    case'E':
                    case 'I':
                    case 'O':
                    case 'U':
                    v+=ch;
                    break;
                    default:
                    c+=ch;
                }
            }
        }
        newwrd = v + c;
    }

    public void display() 
    {
        System.out.println("Original word: " + wrd);
        System.out.println("Rearranged word: " + newwrd);
    }

    public static void main()  
    {
        Rearrange obj = new Rearrange();
        obj.readword();
        obj.freq_vow_con();
        obj.arrange();
        obj.display();
    }
}