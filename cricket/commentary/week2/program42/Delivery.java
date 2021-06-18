package cricket.commentary.week2.program42;

public class Delivery {
	
	
	void displayDeliveryDetails(String bowler, String batsman) {
				
		System.out.println("Bowler Name  : " + bowler);
		
		System.out.println("Batsman Name  : " + batsman);
		
		}
	
	void displayDeliveryDetails(Long runs) {
		
		if (runs < 4)
		{
			System.out.println("Runs Scored : " + runs);
		}else {
			if(runs == 4)
			{
				System.out.println("Its a boundary!!!! " + runs);
			}else {
				if(runs == 6)
				{
					System.out.println("Its a sixer!!!! " + runs);
				}
		}
		
	}
	}
}
