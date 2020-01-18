package Area;

import java.util.Scanner;

public class Zadanie2 {
	public static Shape wczytaj() {
		Scanner sc = new Scanner(System.in);

		Shape shape = null;
		while(shape == null) {
			System.out.println("Wybierz figure: 1) Prostokat; 2) Trojkat; 3) Kolo");
			int wybor = sc.nextInt();
			
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
			}
		}

		return shape;
	}
	
	public static void main(String[] args) {
		Shape first = wczytaj();
		Shape second = wczytaj();

		System.out.println("Pole pierwszej figury: " + first.getArea());
		System.out.println("Pole drugiej figury: " + second.getArea());
		if(first.getArea() >= second.getArea()) {
			System.out.println("Pierwsza figura ma wieksze pole");
		} else {
			System.out.println("Druga figura ma wieksze pole");
		}

		System.out.println("Obwod pierwszej figury: " + first.getPerimeter());
		System.out.println("Obwod drugiej figury: " + second.getPerimeter());
		if(first.getPerimeter() >= second.getPerimeter()) {
			System.out.println("Pierwsza figura ma wiekszy obwod");
		} else {
			System.out.println("Druga figura ma wiekszy obwod");
		}
	}
}




