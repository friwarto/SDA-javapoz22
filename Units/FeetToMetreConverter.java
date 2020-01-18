package Units;

public class FeetToMetreConverter extends Converter {

    @Override
    public String getPrimaryUnit() {
        return "foot";
    }

    @Override
    public String getSecondaryUnit() {
        return "meter";
    }

    @Override
    public double convert(double value) {
        return 0.3048*value;
    }

    @Override
    public double inverseConvert(double value) {
        return 3.2808399*value;
    }
}
