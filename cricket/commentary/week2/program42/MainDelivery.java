package cricket.commentary.week2.program42;

import java.util.Scanner;


public class MainDelivery {

	public static void main(String[] args) {

		int deliveryDetails;

		String bowlerName;

		String batsmanName;

		long run;

		Scanner sc = new Scanner(System.in);

		System.out.println("Menu 1.Player details of the delivery 2.Run details of the delivery :  ");

		deliveryDetails = sc.nextInt();

		if (deliveryDetails == 1) {

			Scanner sc1 = new Scanner(System.in);
			
			System.out.println("Enter Bowler Name : " );
			
			bowlerName = sc1.nextLine();
			
			Scanner sc2 = new Scanner(System.in);

			System.out.println("Enter Batsman Name : " );
			
			batsmanName = sc1.nextLine();
			
			Delivery delivery1 = new Delivery();

			delivery1.displayDeliveryDetails(bowlerName, batsmanName);

		} else {
			if (deliveryDetails == 2) {

				System.out.println("Enter Runs : ");

				run = sc.nextLong();

				Delivery delivery2 = new Delivery();

				delivery2.displayDeliveryDetails(run);
			}

		}
		sc.close();
	}
}
