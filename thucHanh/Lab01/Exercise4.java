import java.util.Scanner;

public class Exercise4 {

    public static float farenheitToCelsius(float f) {
        return (f - 32) * (5.0f/9.0f);
    }

    public static float celsiusToFarenheit(float c) {
        return c * 9.0f/5.0f + 32;
    }
    public static void main(String[] args) {
        float farenheit, celsius;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature in degrees Celsius: ");
        celsius = sc.nextFloat();
        System.out.printf("%3.3f degrees Celsius = %3.3f defrees Farenheit\n", celsius, celsiusToFarenheit(celsius));


        System.out.print("Enter the temperature in degrees Farenheit: ");
        farenheit = sc.nextFloat();
        System.out.printf("%3.3f degrees Celsius = %3.3f defrees Farenheit", farenheit, farenheitToCelsius(farenheit));

    }
}
