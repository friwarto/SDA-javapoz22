package Units;

public class NauticalMileToKilometreConverter extends Converter {

    public String getPrimaryUnit() {
        return "NM";
    }

    public String getSecondaryUnit() {
        return "km";
    }

    public double convert(double value) {
        return Math.round( (value * 1.852) * 100.0) / 100.0;
    }

    public double inverseConvert(double value) {
        return Math.round( (value / 1.852) * 100.0) / 100.0;
    }
}
