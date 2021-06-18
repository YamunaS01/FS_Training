package refuge.count.forloop.week2.program32;

import java.util.Scanner;

public class RefugeCountForloop {

	public static void main(String[] args) {

		int noOfTents;

		int refugePerTent;

		int totalRefuge = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the total number of tents in the camp  :  ");

		noOfTents = sc.nextInt();

		System.out.println("Enter the number citizen in per tent  :  ");

		refugePerTent = sc.nextInt();

		int[] calculateRefugePerTent = new int[noOfTents];

		for (int i = 0; i < noOfTents; i++) {
			calculateRefugePerTent[i] = refugePerTent;
		}

		for (int j = 0; j < calculateRefugePerTent.length; j++) {
			totalRefuge = totalRefuge + calculateRefugePerTent[j];
		}

		System.out.println("Total number of citizens in the camp  : " + totalRefuge);

		sc.close();
	}

}
