package profit.and.lost.toys.method.week2.program35;

import java.text.DecimalFormat;

public class ProfitAndLostToysWithMethod {

	public void calculateProfit(int dozenCount, int pricePerDozen, int sellPerToyRate) {

		double costPerToy = 31.25;
		double profit;
		String profitPercentage;

		System.out.println("Dozens of toys bought :  " + dozenCount);

		System.out.println("Selling rate of a single toy :  " + sellPerToyRate);

		profit = ((sellPerToyRate - costPerToy) / costPerToy) * 100;

		DecimalFormat df = new DecimalFormat("0.00"); // this is for truncating to 2 number after decimal point

		profitPercentage = df.format(profit); // return type of decimal format is string

		System.out.println("Profit percentage  :  " + profitPercentage);

	}

	public static void main(String[] args) {

		ProfitAndLostToysWithMethod profitCheck = new ProfitAndLostToysWithMethod();

		profitCheck.calculateProfit(20, 375, 33);

	}

}
