package find.year.leap.or.not.program9;

public class FindLeapYearOrNot {

	public static void main(String[] args) {
		
   int a = 2024;
   
   int b = a%4;
	
	boolean value = false;
	
		if(b==0)
		{
			value=true;
			
			System.out.println(a + "  It's a Leap Year");
	    }
		else
		{
			value=false;
			System.out.println(a + "  It's not a Leap Year");
		}
		

	}
}