package product.detail.week2.program36;

public class Product {
	
	private long id;
	
	private String productName;
	
	private String supplierName;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	
	void print() {
		System.out.println("Product id  :  "  + id +  "  Product Name : "  + productName +  "  Product Supplier Name :  "  +supplierName);
	}

}

