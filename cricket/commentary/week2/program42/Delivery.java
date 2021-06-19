package cricket.commentary.week2.program42;

public class Delivery {
	
	
	void displayDeliveryDetails(String bowler, String batsman) {
		
		String bowler1 = bowler;
		String[] bowarr = bowler1.split(" "); // the split function will store each word in array which is split by space " " 
		String bowlerLastWord = bowarr[bowarr.length - 1];
		
		String batsman1 = batsman;
		String[] batarr = batsman1.split(" ");
		String batsmanLastWord = batarr[batarr.length - 1];
					
		System.out.println("Bowler Name  : " + bowlerLastWord);
		
		System.out.println("Batsman Name  : " + batsmanLastWord);
		
		}
	
	void displayDeliveryDetails(Long runs) {
		
		if (runs < 4)
		{
			System.out.println("Runs Scored : " + runs);
		}else {
			if(runs == 4)
			{
				System.out.println("It's a boundary!!!! " + runs);
			}else {
				if(runs == 6)
				{
					System.out.println("It's a sixer!!!! " + runs);
				}
		}
		
	}
	}
}
