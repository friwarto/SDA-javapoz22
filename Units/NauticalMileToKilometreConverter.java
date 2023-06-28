package Units;

import java.util.Scanner;

public class NauticalMileToKilometreConverter extends Converter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number in Nautical Miles: ");
        double nautical = input.nextDouble();

        double kilometer = nautical * 1.85200;
        System.out.print(nautical + " Nautical Mile is " + kilometer + " Kilometers");
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
