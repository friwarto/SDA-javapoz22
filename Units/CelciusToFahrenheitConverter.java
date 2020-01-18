package Units;

public class CelciusToFahrenheitConverter  extends Converter {
    @Override
    public String getPrimaryUnit() {
        return "deg Celsius";
    }

    @Override
    public String getSecondaryUnit() {
        return "deg Fahrenheit";
    }

    @Override
    public double convert(double value) {
        return (1.8 * value) + 32;
    }

    @Override
    public double inverseConvert(double value) {
        return (value - 32) / 1.8;
    }
}
