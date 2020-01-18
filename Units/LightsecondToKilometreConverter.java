package Units;

public class LightsecondToKilometreConverter extends Converter {
    public String getPrimaryUnit() {
        return "light year";
    }

    public String getSecondaryUnit() {
        return "kilometer";
    }

    public double convert(double value) {
        return value * 9.4607305 * Math.pow(10,12);
    }

    public double inverseConvert(double value) {
        return value * 1.05702341 * Math.pow(10, -13);
    }
}
