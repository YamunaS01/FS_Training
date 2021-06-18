package difference.consecutive.numbers.week2.program19;

import java.util.Scanner;

public class DifferenceConsecutiveNumber {

	public void calculateDifference(double sum, double sum2) {

		int n;

		int i = 1;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number  :");

		n = sc.nextInt();

		sum = 0;

		sum2 = 0;

		double subtractNumber;

		while (i <= n) {

			sum = sum + Math.pow(i, 2);

			sum2 = sum2 + i;

			i++;

		}

		sum2 = Math.pow(sum2, 2);

		subtractNumber = sum - sum2;

		System.out.println("Sum of N squared consecutive numbers : " + sum);

		System.out.println("Sum of N consecutive number and squared : " + sum2);

		System.out.println("Difference of number  :  " + subtractNumber);

		sc.close();
	}

}
