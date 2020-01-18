package Units;

public class PoundToKilogramConverter  extends Converter {

    @Override
    public String getPrimaryUnit() {
        return "P";
    }

        public String getSecondaryUnit(){
        return "kg";
        }

    @Override
    public double convert(double value) {
        return (value + 0.453 );
    }

   @Override
    public double inverseConvert(double value) {
        return (value + 2.204);
    }
}

