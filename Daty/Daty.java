package Daty;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.Period;

import java.util.Scanner;

public class Daty {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj date urodzenia (RRRR-MM-DD):");
		LocalDate birth = LocalDate.parse(sc.nextLine());
		
		if(birth.isLeapYear()) {
			System.out.println("Urodziles sie w roku przestepnym");
		} else {
			System.out.println("Urodziles sie w roku nie-przestepnym");
		}
		
		System.out.println("Urodziles sie w " + birth.getDayOfWeek());
		
		// --
		
		LocalDate thisYear = birth.withYear( LocalDate.now().getYear() );
		System.out.println(
			"Twoje urodziny (" + thisYear + ") wypadaja w " + thisYear.getDayOfWeek()
		);
		
		// -- 
		
		Period difference = birth.until(LocalDate.now());
		System.out.println("Masz " + difference.getYears() + " lat");
	}
}
