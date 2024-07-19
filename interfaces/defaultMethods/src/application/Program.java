package application;

import java.util.Locale;
import java.util.Scanner;

import model.services.BrazilInterestService;
import model.services.InterestService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
		InterestService intSer = new BrazilInterestService(2.0);
		
		double payment = intSer.payment(amount, months);
		
		System.out.printf("Payment after %d months: %.2f", months, payment);
		
		
		sc.close(); 
	}

}
