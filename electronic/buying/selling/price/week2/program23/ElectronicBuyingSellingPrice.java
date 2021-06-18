package electronic.buying.selling.price.week2.program23;

public class ElectronicBuyingSellingPrice {

	public String name;
	private double buyAmount;
	private double sellAmount;

	ElectronicBuyingSellingPrice(String gagetName, double buyPrice, double sellPrice) { // Constructor

		name = gagetName;
		buyAmount = buyPrice;
		sellAmount = sellPrice;

	}

	public String getName() {
		return name;
	}

	public double getBuy() {
		return buyAmount;
	}

	public double getSell() {
		return sellAmount;
	}

	public void print() {
		System.out.println(getName() + "_" + getBuy() + "_" + getSell());
	}

	public static void main(String[] args) {

		double sum = 0;

		ElectronicBuyingSellingPrice[] gagetDetails = new ElectronicBuyingSellingPrice[3];

		ElectronicBuyingSellingPrice productDetails1 = new ElectronicBuyingSellingPrice("Mobile", 205.01, 511.24);

		ElectronicBuyingSellingPrice productDetails2 = new ElectronicBuyingSellingPrice("iPad", 1475, 3856);

		ElectronicBuyingSellingPrice productDetails3 = new ElectronicBuyingSellingPrice("Laptop", 31012, 50000);

		gagetDetails[0] = productDetails1;

		gagetDetails[1] = productDetails2;

		gagetDetails[2] = productDetails3;

		for (ElectronicBuyingSellingPrice i : gagetDetails) {

			i.print();
			sum += i.getSell();
		}
		System.out.println("Sum of sell amount :  " + sum);
	}
}
