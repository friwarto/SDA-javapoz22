package Units;

public class RankineToKelvinConverter extends Converter{

    @Override
    public String getPrimaryUnit() {
        return "Rankine";}

    @Override
    public String getSecondaryUnit() {
        return "Kelwin";
    }

    @Override
    public double convert(double value) {
        return ((value - 491.67)/1.8) + 273.15;
    }

    @Override
    public double inverseConvert(double value) {
        return ((value - 273.15) * 1.8) - 491.67;
    }
}
