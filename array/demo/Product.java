package array.demo;

public class Product {
	int id;
	String name;
	double cost;

	Product(int id, String name, double cost) {
		this.id = id;
		this.name = name;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public double getcost() {
		return cost;
	}

	public  static void main(String[] args) {

		//Product[] dummy = {new Product(10, "Pen"), new Product(20, "Pencil"),
		//		new Product(30, "Eraser")};
		
		// Create a products that can store 3 Product Objects
		Product[] products = new Product[3];

		// Creating 3 Product Objects
		Product product1 = new Product(10, "Pen", 98.99);
		Product product2 = new Product(20, "Pencil", 87);
		Product product3 = new Product(30, "Eraser", 10.01);

		// Add Product Objects to products
		products[0] = product1;
		products[1] = product2;
		products[2] = product3;
		

		// Print the products
		for (Product temp : products) {
			System.out.println(temp);
			System.out.println(temp.getId() + "-" + temp.getName() + "_" + temp.getcost());
		}
		
		//System.out.println("Dummy Array");
		//for (Product temp : dummy) {
		//	System.out.println(temp);
		//	System.out.println(temp.getId() + "-" + temp.getName());
		}
	}

