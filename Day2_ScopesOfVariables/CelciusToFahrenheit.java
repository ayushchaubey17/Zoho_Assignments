import java.util.Scanner;

public class CelciusToFahrenheit {
    public static void main(String[] args) {
        System.out.println("Enter the temperature in celcius");
        Scanner sc = new Scanner(System.in);

        double tempInCel = sc.nextFloat();

        double tempInFah = (tempInCel * 9/5)+32;

        System.out.println("conversion to temperature in fahrenheit is "+tempInFah+"°F ");

    }
}
