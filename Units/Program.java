package Units;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(
			"Wybierz konwersje. Aby konwertowac B->A, zamiast A->B, podaj numer ujemny.\n" +
			" 1. Mile -> kilometry\n" +
			" 2. Mile morskie -> kilometry\n" +
			" 3. Stopy -> metry\n" +
			" 4. Cale -> centymetry\n" +
			" 5. Sekundy swietlne -> kilometry\n" +
			" 6. Galony amerykanskie -> litry\n" +
			" 7. Galony brytyjskie -> litry\n" +
			" 8. Funty -> kilogramy\n" +
			" 9. Kamienie (British stones) -> kilogramy\n" +
			"10. Temperatura (skala Celsjusza) -> temperatura (skala Fahrenheita)\n" +
			"11. Temperatura (skala Celsjusza) -> temperatura (skala Rankine'a)\n" +
			"12. Temperatura (skala Celsjusza) -> temperatura (Kelwiny)\n" +
			"13. Temperatura (skala Fahrenheita) -> temperatura (skala Rankine'a)\n" +
			"14. Temperatura (skala Fahrenheita) -> temperatura (Kelwiny)\n" +
			"15. Temperatura (skala Rankeine'a) -> temperatura (Kelwiny)\n" +
			"16. Kilowatogodziny (kWh) -> dzule (J)\n" +
			"17. Konie mechaniczne (hp) -> waty (W)\n" +
			"18. Stopnie -> radiany\n"
		);

		int choice;
		choice = sc.nextInt();

		Converter conv;
		switch(Math.abs(choice)) {
			case 1:
				conv = new MileToKilometreConverter();
			break;

			case 2:
				conv = new NauticalMileToKilometreConverter();
			break;

			case 3:
				conv = new FeetToMetreConverter();
			break;

			case 4:
				conv = new InchToCentimetreConverter();
			break;

			case 5:
				conv = new LightsecondToKilometreConverter();
			break;

			case 6:
				conv = new GallonUsToLitreConverter();
			break;

			case 7:
				conv = new GallonImperialToLitreConverter();
			break;

			case 8:
				conv = new PoundToKilogramConverter();
			break;
			
			case 9:
				conv = new StoneToKilogrammeConverter();
			break;

			case 10:
				conv = new CelciusToFahrenheitConverter();
			break;
			
			case 11:
				conv = new CelciusToRankineConverter();
			break;

			case 12:
				conv = new CelciusToKelvinConverter();
			break;

			case 13:
				conv = new FahrenheitToRankineConverter();
			break;
			
			case 14:
				conv = new FahrenheitToKelvinConverter();
			break;
			
			case 15:
				conv = new RankineToKelvinConverter();
			break;

			case 16:
				conv = new KilowatthourToJouleConverter();
			break;

			case 17:
				conv = new HorsepowerToWattConverter();
			break;

			case 18:
				conv = new AnglesToRadiansConverter();
			break;

			default:
				System.out.println("Nieprawidlowy wybor!");
				System.exit(1);
		}

		System.out.println("Podaj wartosc:");
		double value = sc.nextDouble();

		if(choice > 0) {
			System.out.println(value + " " + conv.getPrimaryUnit() + " = " + conv.convert(value) + " " + conv.getSecondaryUnit());
		} else {
			System.out.println(value + " " + conv.getSecondaryUnit() + " = " + conv.inverseConvert(value) + " " + conv.getPrimaryUnit());
		}
	}
}
