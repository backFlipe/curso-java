package entities;

public class User {
	
	private int number;
	private String name;
	private double balance;
	
	
	public void getNumber (int number) {
		this.number = number;
		
	}
	
	public void setName (String name) {
		this.name = name;
		
	}
	
	public String getName () {
		return name;
		
	}
	
	public void deposit (double value) {
		balance += value;
		
	}
	
	public void withdraw (double value) {
		balance -= value + 5;
		
	}
	
	public String toString() {
		return "Account " + number + ", "
				+ "Holder: " + name + ", "
				+ "Balance: $" + balance; 
		
	}
	
}
