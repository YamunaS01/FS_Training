package area.of.shape.hexagon.week2.program41;

public class Circle extends Shape {

	int radius;
	double circleArea;

	Circle(int cirRadius) {
		super("Circle");
		radius = cirRadius;

	}

	public double calculateArea() {
		return circleArea = 3.14 * radius * radius;

	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}
