package VIT.Classwork;
import java.util.*;

public class CeltoFah
{
    public static void CeltoFah()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Celsius Temperature:");
        double c = obj.nextDouble();
        double f = (9.0/5.0)*(c) + 32;
        System.out.println("Fahrenheit Temperature: " + f + "°F");
    }
}