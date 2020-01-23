package Units;

import java.util.Scanner;

public class HorsepowerToWattConverter extends Converter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number in HorsePower: ");
        double horsePower = input.nextDouble();

        double watt = horsePower * 274.15;
        System.out.print(horsePower + " HorsePower is " + watt + " Watts");
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
