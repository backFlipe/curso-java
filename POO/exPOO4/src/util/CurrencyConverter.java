package util;

public class CurrencyConverter {
	
	public static double price;
	public static double quantity;
	
	public static double converter(double quantity) {
		return (quantity * price) + ((quantity * price) * 6/100);
		
	}
	
}
