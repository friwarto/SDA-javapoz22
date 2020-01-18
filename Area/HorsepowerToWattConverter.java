public class HorsepowerToWattConverter extends Converter {
    public String getPrimaryUnit() {
        return "hp";
    }

    public String getSecondaryUnit() {
        return "W";
    }

    public double convert(double value) {
        return value * 735.5;
    }

    public double inverseConvert(double value) {
        return value / 735.5;
    }
}
