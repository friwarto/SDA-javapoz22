package Units;

public class CelciusToRankineConverter extends Converter {

	public String getPrimaryUnit() {
		return "Celcius";
	}

	public String getSecondaryUnit() {
		return "Rankine";
	}

	public static double round(double value, int places) {
		if (places < 0) throw new IllegalArgumentException();

		long factor = (long) Math.pow(10, places);
		value = value * factor;
		long tmp = Math.round(value);
		return (double) tmp / factor;
	}

	public double convert(double value) {
		double not_rounded = (value + 273.15)*9/5;
		return round(not_rounded, 2);
	}


	public double inverseConvert(double value) {
		double not_rounded = value /9.5 - 273.5;
		return round(not_rounded,2);
	}

}

