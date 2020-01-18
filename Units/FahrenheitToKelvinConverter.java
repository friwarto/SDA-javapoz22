package Units;

public class FahrenheitToKelvinConverter extends Converter {

    public String getPrimaryUnit() {
        return "F";
    }

    public String getSecondaryUnit() {
        return "K";
    }

    public double convert(double value) {
        return  (value + 459.67)* 5/9;
    }

    public double inverseConvert(double value) {
        return value*5/9 + 459.67;
    }
}
