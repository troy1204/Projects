import java.util.Scanner;
import java.lang.Math;

public class TemperatureConverter {
    private static float f = 0, c = 0;
    private static final Scanner scan = new Scanner (System.in);
    private static int converChoice = 1;

    public static void main(String [] args) {
        System.out.println("Please enter temperature in Celsius");
        c = scan.nextFloat();
        convertCtoFAndPrint(c);
        System.out.println("Please enter temperature in Farenheit");
        f = scan.nextFloat();
        convertFtoCAndPrint(f);     
    }

    public static void convertCtoFAndPrint(float c) {
        f = Math.round(((((9.0/5.0 * c) + 32))/100.0)*100.0);
        System.out.println(c + " degrees C is " + f + " degrees F.");
    }

    public static void convertFtoCAndPrint(float f) {
        c = Math.round((((5.0/9.0 * (f - 32)))/100.0*100.0));
        System.out.println(f + " degrees F is " + c + " degrees C.");
    }
}

//celsius = 5.0 / 9.0 * ( fahrenheit - 32 );

//fahrenheit = 9.0 / 5.0 * celsius + 32;