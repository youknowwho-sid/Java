package X;

public class Diamond_Pattern
{
    public static void main()
    {
        char p = '*';
        int B = 4;
        int A = -1;
        for(int i=1; i <= 5; i++) 
        {
            for(int j=1; j <= B; j++) 
            { 
                System.out.print(" ");
            }
            System.out.print(p);
            for(int k=1; k <= A; k++) 
            { 
                System.out.print(" ");
            }
            if(i > 1) 
            { 
                System.out.print(p);
            }
            System.out.println();
            A = A + 2;
            B = B - 1;
        }   
        int height = 4;
        int rowlength = (4)*2;
        for(int i=0; i<= height; i++)
        {
            int start = i;
            int end = rowlength-i;
            for(int j=0;j <= rowlength; j++)
            {
                if(j==end)
                {
                    System.out.println("*");
                    break;
                }
                else if(j == start)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
        }
    }
}