package calculate.discount.purchase.week2.program25;

import java.util.Scanner;

public class CalculateDiscountPurchase {
	
	float totalAmount;
	
	float discountAmount;
	
	float savedAmount;
	
public void CalculatePrice(String str){
		
		float item1;
		
		float item2;
		
		int discount;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Amount of the first item  : ");
		
		item1 = sc.nextFloat();
		
        System.out.println("Amount of the second item  : ");
		
		item2 = sc.nextFloat();
		
		System.out.println("Discount value  : ");
		
		discount = sc.nextInt();
		
		totalAmount = item1+item2;
		
		discountAmount = (totalAmount/100) * discount;
		
		savedAmount = totalAmount - discountAmount;
		
	}

	public static void main(String[] args) {
		
		CalculateDiscountPurchase purchaseDetails = new CalculateDiscountPurchase();
		
		purchaseDetails.CalculatePrice("");
		
		System.out.println("Total Amount for the purchase items : "  + (purchaseDetails.totalAmount));
		
		System.out.println("Discount Amount for the purchase items : "  + (purchaseDetails.discountAmount));
		
		System.out.println("Saved Amount for the purchase items : "  + (purchaseDetails.savedAmount));
		
	}

}
