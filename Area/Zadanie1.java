package Area;

import java.util.Scanner;

public class Zadanie1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Wybierz figure: 1) Prostokat; 2) Trojkat; 3) Kolo");
		int wybor = sc.nextInt();
		
		switch(wybor) {
			case 1:
				System.out.println("Podaj dlugosc pierwszego boku:");
				int bokA = sc.nextInt();
				System.out.println("Podaj dlugosc drugiego boku:");
				int bokB = sc.nextInt();
				
				Rectangle r = new Rectangle(bokA, bokB);
				System.out.println("Pole prostokata: " + r.getArea());
				System.out.println("Obwod prostokata: " + r.getPerimeter());
			break;
			
			case 2:
				System.out.println("Podaj dlugosc boku:");
				int side = sc.nextInt();
				
				Triangle t = new Triangle(side);
				System.out.println("Pole trojkata: " + t.getArea());
				System.out.println("Obwod trojkata: " + t.getPerimeter());
			break;
			
			case 3:
				System.out.println("Podaj promien kola:");
				int radius = sc.nextInt();
				
				Circle c = new Circle(radius);
				System.out.println("Pole kola: " + c.getArea());
				System.out.println("Obwod kola: " + c.getPerimeter());
			break;
		}
	}
}




