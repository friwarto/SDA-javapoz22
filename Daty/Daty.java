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
		
		System.out.println(birth);
	}
}
