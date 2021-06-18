package cricket.commentary.week2.program42;

import java.util.Scanner;

import area.of.shape.hexagon.week2.program41.Rectangle;
import area.of.shape.hexagon.week2.program41.Shape;
import area.of.shape.hexagon.week2.program41.Square;

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
			
			Delivery delivery1 = new Delivery();
			
			System.out.println("Enter Bowler Name : ");
			
			bowlerName = sc.next();
			
			System.out.println("Enter Batsman Name : ");
			
			batsmanName = sc.next();

			delivery1.displayDeliveryDetails(bowlerName, batsmanName);

		} else {
			if (deliveryDetails == 2) {
				
				System.out.println("Enter Runs : ");
				
				run = sc.nextLong();
				
				Delivery delivery2 = new Delivery();

		        delivery2.displayDeliveryDetails(run);
	}

}
	}
}
