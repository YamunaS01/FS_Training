package refuge.count.foreach.week2.program34;

import java.util.Scanner;

public class RefugeCountForEach {

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
		
		for( int arrValue : calculateRefugePerTent)  //for each loop take the value from existing array
		{
			arrValue = refugePerTent;
			
			totalRefuge = totalRefuge + arrValue;
				
		}

		System.out.println("Total number of citizens in the camp  : " + totalRefuge);

		sc.close();

	}

}
