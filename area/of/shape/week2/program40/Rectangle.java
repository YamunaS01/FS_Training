package area.of.shape.week2.program40;

public class Rectangle extends Shape {

	int length;
	int breath;
	double rectangleArea;

	Rectangle(int recLength, int recBreath) {
		super("Rectangle");

		length = recLength;
		breath = recBreath;
	}

	public double calculateArea() {

		return rectangleArea = length * breath;

	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreath() {
		return breath;
	}

	public void setBreath(int breath) {
		this.breath = breath;
	}

}
