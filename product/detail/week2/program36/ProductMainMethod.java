package product.detail.week2.program36;

import java.util.Scanner;

public class ProductMainMethod {

	public static void main(String[] args) {
		
		Product prod = new Product();
		
	/**	long idValue;
		
		String productNameValue;
		
		String supplierNameValue;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the ID : ");
		
		idValue = sc.nextLong();
		
		System.out.println("Enter the Product Name : ");
		
		productNameValue = sc.next();
		
		System.out.println("Enter the Product Supplier Name : ");
		
		supplierNameValue = sc.next(); */
		
		prod.setId(1);
		
		 prod.setProductName("Printer");
		 
		 prod.setSupplierName("HP Company");
		 
		 System.out.println("Product ID  :  "  + prod.getId() +  "  Product Name : "  + prod.getProductName() +  "  Product Supplier Name :  "  +prod.getSupplierName());
		 
		/** prod.print();
		 
		 sc.close(); */
	}

}
