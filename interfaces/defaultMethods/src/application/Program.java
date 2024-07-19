package application;

import java.util.Locale;
import java.util.Scanner;

import model.services.InterestService;
import model.services.USAInterestService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
		InterestService intSer = new USAInterestService(1.0);
		
		double payment = intSer.payment(amount, months);
		
		System.out.printf("Payment after %d months: %.2f", months, payment);
		
		
		sc.close(); 
	}

}
