package profit.and.lost.purchase.toys.week2.program24;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ProfitAndLostToys {

	public static void main(String[] args) {
		
		int dozenOfToys;
		double perDozenRate = 375;
		double costPerToy = 31.25;
		double sellPerToyRate;
		double profit;
		String profitPercentage;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dozens of toys bought :  " );
		
		dozenOfToys = sc.nextInt();
		
		System.out.println("Selling rate of a single toy :  " );
		
		sellPerToyRate = sc.nextDouble();
		
		profit = ((sellPerToyRate - costPerToy) /costPerToy) * 100;
		
		DecimalFormat df = new DecimalFormat("0.00");  // this is for truncating to 2 number after decimal point
		
		profitPercentage = df.format(profit); // return type of decimal format is string
		
		System.out.println("Profit percentage  :  " + profitPercentage);
		
		sc.close();
			
	}

}
