package Units;

public class GallonUsToLitreConverter extends Converter {


    public String getPrimaryUnit() { return "Gallon";
    }


    public String getSecondaryUnit() {
        return "Liter";
    }


    public double convert(double value) {
        return value / 0.2641728747;
    }


    public double inverseConvert(double value) {
        return value / 3.785411784;
    }
}
