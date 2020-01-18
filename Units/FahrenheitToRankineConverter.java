package Units;

public class FahrenheitToRankineConverter extends Converter{


    @Override
    public String getPrimaryUnit() {
        return "degree Fahrenheit";
    }

    @Override
    public String getSecondaryUnit() {
        return "degree Rankine";
    }

    @Override
    public double convert(double value) {
        return 	value + 459.67;
    }

    @Override
    public double inverseConvert(double value) {
        return value - 459.67;
    }
}

