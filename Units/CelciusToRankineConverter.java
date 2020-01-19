package Units;

public class CelciusToRankineConverter extends Converter {

	public String getPrimaryUnit() {
		return "Celcius";
	}

	public String getSecondaryUnit() {
		return "Rankine";
	}


	public double convert(double value) {
		return (value + 273.15)*9/5;
	}


	public double inverseConvert(double value) {
		return value /9.5 - 273.5;
	}
}

