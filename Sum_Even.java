package VIT.Classwork;
public class Sum_Even
{
    public static void main()
    {
        int s = 0;
        int i = 1;
        int n = 2;
        while(i<16)
        {
            s+=n;
            n+=2;
            i++;
        }
        System.out.println("Sum of First 15 Even Numbers = " + s);
    }
}