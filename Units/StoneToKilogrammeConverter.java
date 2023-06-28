package Units;

import java.util.Scanner;

public class StoneToKilogrammeConverter extends Converter {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number in British Stones: ");
            double stones = input.nextDouble();

            double kilograms = stones * 6.35029318;
            System.out.print(stones + " stones is " + kilograms + " killograms");
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
