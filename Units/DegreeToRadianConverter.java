public class DegreeToRadianConverter extends Converter {

	public String getPrimaryUnit() {
		return "deg";
	}

	public String getSecondaryUnit() {
		return "rad";
	}

	public double convert(double value) {
		return value * Math.PI / 180.0;
	}
	
	public double inverseConvert(double value) {
		return value * 180.0 / Math.PI;
	}

}
