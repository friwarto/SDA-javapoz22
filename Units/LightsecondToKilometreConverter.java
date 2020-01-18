package Units;

public class LightsecondToKilometreConverter extends Converter {
    public String getPrimaryUnit() {
        return "light second";
    }

    public String getSecondaryUnit() {
        return "kilometer";
    }

    public double convert(double value) {
        return value * 29979246;
    }

    public double inverseConvert(double value) {
        return value * 3.3356410 * Math.pow(10,-6);
    }
}
