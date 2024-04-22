package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public double valorTotalEmEstoque() {
		double value = price * quantity;
		return value;
		
	}
	
	public void adicionarProduto(int quantidade) {
		quantity += quantidade;
		
	}
	
	public void removerProduto(int quantidade) {
		quantity -= quantidade;
		
	}
	
	public String toString() {
		return name + ", $" + String.format("%.2f", price) + ", " + quantity + " units, Total: $" + String.format("%.2f", valorTotalEmEstoque()); 
		
	}

}
