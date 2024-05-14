package exemploVet2;

import java.util.Scanner;
import java.util.Locale;
import entities.Product;

public class Application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
	
		System.out.println("How many itens?");
		int n = sc.nextInt();
		
		Product[] vect = new Product[n];
		
		double sum = 0;
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Product name: ");
			sc.nextLine();
			String name = sc.nextLine();	
			
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			
			vect[i] = new Product(name, price);
			
			sum += vect[i].getPrice();
			
		}
		
		double average = sum / vect.length;
		
		System.out.printf("Average price: %.2f\n", average);
		
		sc.close();
		
	}

}
