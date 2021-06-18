package area.of.shape.hexagon.week2.program41;

import java.util.Scanner;

public class MainShape {

	public static void main(String[] args) {

		int shapesList;

		Scanner sc = new Scanner(System.in);

		System.out.println("Choose the Shapes 1.Rectangle 2.Square 3.Circle 4.Hexagon for Area Calculation :  ");

		shapesList = sc.nextInt();

		if (shapesList == 1) {
			Shape shape1 = new Shape("Rectangle");

			Rectangle rectangle1 = new Rectangle(100, 40);

			System.out.println("Length Value  : " + rectangle1.getLength());

			System.out.println("Breath Value  : " + rectangle1.getBreath());

			System.out.println("Area of Rectangle  : " + rectangle1.calculateArea());

		} else {
			if (shapesList == 2) {
				Shape shape2 = new Shape("Square");

				Square square1 = new Square(20);

				System.out.println("Sides Value  : " + square1.getSide());

				System.out.println("Area of Square  : " + square1.calculateArea());

			} else {
				if (shapesList == 3) {
					Shape shape3 = new Shape("Circle");

					Circle circle1 = new Circle(5);

					System.out.println("Radius Value  : " + circle1.getRadius());

					System.out.println("Area of Circle  : " + circle1.calculateArea());

				} else {
					if (shapesList == 4) {
						Shape shape4 = new Shape("Hexagon");

						Hexagon hexagon1 = new Hexagon(20);

						System.out.println("Radius Value  : " + hexagon1.getHexagonSide());

						System.out.println("Area of Hexagon : " + hexagon1.calculateArea());
					}

				}
			}
		}
	}
}
