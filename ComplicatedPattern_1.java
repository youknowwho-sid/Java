package X;

/** Sid */
public class ComplicatedPattern_1
{
    public static void main()
    {
        int i;
        int j;
        int k;
        {  
            char a = 65;
            for (i =0; i < 5 ; i++) 
            { 
                for (j = 0; j< 1 ; j++) 
                { 
                    for(k = 0;k <= i;k++)
                    {
                        System.out.print(" "); 
                        System.out.print(a); 
                    }
                }
                a++;
                System.out.println(); 
            }
        }	 
        {   
            char a = 68;
            for (i = 5; i > 0; i--) 
            { 
                for (j = 1; j  > 0 ; j--) 
                { 
                    for(k = 2;k <= i;k++)
                    {
                        System.out.print(" "); 
                        System.out.print(a); 
                    }
                }
                a--;
                System.out.println(); 
            } 
        }
    }
}
