package power.of.individual.element.week2.program21;

public class PowerOfIndividualNumber {

	public static void main(String[] args) {
		
		int num [] = {3,6,2,1};
		
		double num1 [] = new double[10];
		
		int i;
		
		for(i=0; i<num.length; i++)
		{
			num1[i] = Math.pow(num[i],i);
			
		}
		
        for(i=0; i<num.length; i++)
       {
		System.out.println(num1[i]);
		
	  }
	}

}
