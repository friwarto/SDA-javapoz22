package Units;

public class GallonImperialToLitreConverter extends Converter {

    @Override
    public String getPrimaryUnit() {
        return "UK Gal";
    }

    @Override
    public String getSecondaryUnit() {
        return "Litre";
    }

    @Override
    public double convert(double value) {
        return value/0.21997;
    }

    @Override
    public double inverseConvert(double value) {
        return value*0.21997;
    }
}
