package Units;

public class KilowatthourToJouleConverter extends  Converter {
    @Override
    public String getPrimaryUnit() {
        return "kWh";
    }

    @Override
    public String getSecondaryUnit() {
        return "J";
    }

    @Override
    public double convert(double value) {
        return value*3600000;
    }

    @Override
    public double inverseConvert(double value) {
        return value/3600000;
    }
}
