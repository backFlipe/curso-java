package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

	private Date manufactureDate;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public UsedProduct() {
		
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.getName()+ " $" + super.getPrice() + "(Manufacture date: " + sdf.format(manufactureDate) + ")");
		return sb.toString();
	}
}
