package area.of.shape.hexagon.week2.program41;

public class Square extends Shape {
	int side;
	double squareArea;

	Square(int side) {
		super("Square");

		this.side = side;

	}

	public double calculateArea() {

		return squareArea = side * side ;

	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

}
