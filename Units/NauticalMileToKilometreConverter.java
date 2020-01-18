package Units;

public class NauticalMileToKilometreConverter extends Converter {

    public String getPrimaryUnit() {
        return "NM";
    }

    public String getSecondaryUnit() {
        return "km";
    }

    public double convert(double value) {
        return value * 1.852;
    }

    public double inverseConvert(double value) {
        return value / 1.852;
    }
}
