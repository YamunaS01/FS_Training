package refuge.count.whileloop.week2program33;

import java.util.Scanner;

public class RefugeCountWhileloop {

	public static void main(String[] args) {
	
		int noOfTents;

		int refugePerTent;

		int totalRefuge = 0;
		
		int i=0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the total number of tents in the camp  :  ");

		noOfTents = sc.nextInt();

		System.out.println("Enter the number citizen in per tent  :  ");

		refugePerTent = sc.nextInt();

		int[] calculateRefugePerTent = new int[noOfTents];
		
		while(i<noOfTents)
		{
			calculateRefugePerTent[i] = refugePerTent;
			
			totalRefuge = totalRefuge + calculateRefugePerTent[i];
			
			i++;
			
		}

		System.out.println("Total number of citizens in the camp  : " + totalRefuge);

		sc.close();

	}

}
