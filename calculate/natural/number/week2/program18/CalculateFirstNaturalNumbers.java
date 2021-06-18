package calculate.natural.number.week2.program18;

import java.util.Scanner;

public class CalculateFirstNaturalNumbers {
	
	  public  void calculateSum(int sum){
		
		    int i;
	        
		    sum = 0;
		    
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the number :    ");
			
			int n = sc.nextInt();
			
			for(i=0;i<=n;i++)
			{
				if(i%3==0 || i%5==0)
				{
					sum = sum + i;
			    }
			
			}	
			
			  System.out.println("The sum on N natural number is : " + sum);
			
			  sc.close();
	  }
	  		
}
