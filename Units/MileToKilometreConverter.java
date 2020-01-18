package Units;

public class MileToKilometreConverter extends Converter {


    @Override
    public String getPrimaryUnit() {
        return "mile";
    }

    @Override
    public String getSecondaryUnit() {
        return "km";
    }

    @Override
    public double convert(double value) {
        return value * 1.609344;
    }

    @Override
    public double inverseConvert(double value) {
        return value * 0.62137;
    }
}
