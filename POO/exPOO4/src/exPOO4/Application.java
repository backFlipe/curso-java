package exPOO4;

import java.util.Scanner;
import java.util.Locale;
import util.CurrencyConverter;

public class Application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("What is the dolar price? ");
		CurrencyConverter.price = sc.nextDouble();
		
		System.out.print("How much dolar do you want to buy? ");
		CurrencyConverter.quantity = sc.nextDouble();
		
		double total = CurrencyConverter.converter(CurrencyConverter.quantity);
		
		System.out.print("Amount to be paid in reais: "+  total);
		
		
	}

}
