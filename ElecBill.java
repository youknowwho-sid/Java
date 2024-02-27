package VIT.Classwork;
import java.util.*;
public class ElecBill
{
    public static void main()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Units:");
        double bill = 0;
        int unit = obj.nextInt();
        if(unit <= 50)
        {
            bill = unit * 5;
        }
        else if(unit > 50 && unit < 100)
        {
            bill = 50 * 5 + (unit-50)*7;
        }
        else 
        {
            bill = 50 * 5 + 50 * 7 + (unit-100)*9;
        }
        System.out.print("Bill = "+ bill);
    }
}