package Units;

public class CelciusToKelvinConverter extends Converter {
    public String getPrimaryUnit() {
        return "C";
    }

    public String getSecondaryUnit() {
        return "K";
    }

    public double convert(double value) {
        return value + 273.15;
    }

    public double inverseConvert(double value) {
        return value - 273.15;
    }

}
