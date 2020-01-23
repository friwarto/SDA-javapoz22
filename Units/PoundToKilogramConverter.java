package Units;

import java.util.Scanner;

public class PoundToKilogramConverter extends Converter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number in Pounds: ");
        double pound = input.nextDouble();

        double kilograms = pound * 0.45359237;
        System.out.print(pound + " Pound is " + kilograms + " killograms");
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
