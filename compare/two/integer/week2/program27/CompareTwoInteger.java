package compare.two.integer.week2.program27;

public class CompareTwoInteger {

	public static void main(String[] args) {

		int number1 = 50;

		int number2 = 80;

		System.out.println("Enter the first number : " + number1);

		System.out.println("Enter the second number : " + number2);

		if (number1 > number2) {
			System.out.println(number1 + "   is greater than   " + number2);

			System.out.println(number2 + "   is lesser than    " + number1);
		} else

		if (number2 > number1) {
			System.out.println(number2 + "  is greater than   " + number1);

			System.out.println(number1 + "   is lesser than    " + number2);
		} else 
			
			if (number1 == number2) {
            System.out.println(number1 + "    is equal to   " + number2);
		}
	}
}
