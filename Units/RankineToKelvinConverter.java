package Units;

import java.util.Scanner;

public class RankineToKelvinConverter extends Converter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number in Rankines: ");
        double rankine = input.nextDouble();

        double kelvin = rankine * 0.555555556;
        System.out.print(rankine + " Rankine is " + kelvin + " Kelvins");
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
