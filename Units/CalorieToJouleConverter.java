package Units;

public class CalorieToJouleConverter extends Converter {
    @Override
    public String getPrimaryUnit() {
        return "cal";
    }

    @Override
    public String getSecondaryUnit() {
        return "J";
    }

    @Override
    public double convert(double value) {
        return value * 4.18400;
    }

    @Override
    public double inverseConvert(double value) {
        return value * 0.239005736;
    }
}
