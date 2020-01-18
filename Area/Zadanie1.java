package Area;

import java.util.Scanner;

public class Zadanie1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Wybierz figure: 1) Prostokat; 2) Trojkat; 3) Kolo");
		int wybor = sc.nextInt();

		Shape shape = null;
		switch(wybor) {
			case 1:
				System.out.println("Podaj dlugosc pierwszego boku:");
				int bokA = sc.nextInt();
				System.out.println("Podaj dlugosc drugiego boku:");
				int bokB = sc.nextInt();
				
				shape = new Rectangle(bokA, bokB);
			break;
			
			case 2:
				System.out.println("Podaj dlugosc boku:");
				int side = sc.nextInt();
				
				shape = new Triangle(side);
			break;
			
			case 3:
				System.out.println("Podaj promien kola:");
				int radius = sc.nextInt();
				
				shape = new Circle(radius);
			break;
			
			default:
				System.out.println("Nieprawidlowy wybor!");
				System.exit(1);
		}
		
		if(shape != null) {
			System.out.println("Pole: " + shape.getArea());
			System.out.println("Obwod: " + shape.getPerimeter());
		}
	}
}




