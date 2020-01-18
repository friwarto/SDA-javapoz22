package Units;

public abstract class Converter {

	public abstract String getPrimaryUnit();
	public abstract String getSecondaryUnit();

	public abstract double convert(double value);
	public abstract double inverseConvert(double value);

}
