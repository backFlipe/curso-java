package entities;

public class Product implements Comparable<Product>{
	
	private String name;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	private double price;

	@Override
	public String toString() {
		return getName() + ", " + getPrice();
	}
	@Override
	public int compareTo(Product other) {
		return price.compareTo(other.getPrice());
	}
	
	
}
