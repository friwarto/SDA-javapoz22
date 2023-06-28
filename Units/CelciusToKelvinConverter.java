package Units;

import java.util.Scanner;

public class CelciusToKelvinConverter extends Converter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number in Celcius: ");
        double celcius = input.nextDouble();

        double kelvin = celcius * 274.15;
        System.out.print(celcius + " Celcius is " + kelvin + " Kelvins");
    }

    @Override
    public String getPrimaryUnit() {
        return null;
    }

    @Override
    public String getSecondaryUnit() {
        return null;
    }

    @Override
    public double convert(double value) {
        return 0;
    }

    @Override
    public double inverseConvert(double value) {
        return 0;
    }
}
