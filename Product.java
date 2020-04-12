package Test2;

public class Product implements Comparable<Product> {
	private String productName;
	private int productNum;
	public Product(String productName, int productNum) {
		this.productName = productName;
		this.productNum = productNum;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public int getProductNum() {
		return productNum;
	}
	
	public int compareTo(Product compareProduct) { // override
		// ascending order
		return this.productNum - compareProduct.productNum;
		// descending order
		// return compareProduct.productNum - this.productNum;
	}
	
	public String toString() {
		return "productName: " + productName + "productNum: " + productNum;
	}
}
