package Units;

public class InchToCentimetreConverter extends Converter {

    @Override
    public String getPrimaryUnit() {
        return "inch";
    }

    @Override
    public String getSecondaryUnit() {
        return "Centimeter";
    }

    @Override
    public double convert(double value) {
        return value * 2.54;
    }

    @Override
    public double inverseConvert(double value) {
        return 2.54 / value;
    }
}
