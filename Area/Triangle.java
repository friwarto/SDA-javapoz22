package Area;

public class Triangle extends Shape {
	protected double side;

	public Triangle(double side) {
		this.side = side;
	}

	public double getArea() {
		return Math.sqrt(3) / 4.0 * side * side;
	}
	
	public double getPerimeter() {
		return 3 * side;
	}

}

