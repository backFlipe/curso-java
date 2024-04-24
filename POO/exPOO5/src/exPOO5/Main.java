package exPOO5;

import java.util.Scanner;
import java.util.Locale;
import entities.User;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		User usr = new User();
		
		System.out.print("Enter the account number: ");
		usr.getNumber(sc.nextInt());
		
		System.out.print("Enter the account holder: ");
		usr.setName(sc.nextLine());
		usr.setName(sc.nextLine());
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char resp = sc.next().charAt(0);
		
		if (resp == 'y') {
			System.out.print("Enter initial deposit value: ");
			usr.deposit(sc.nextDouble());						
		}
		
		System.out.println("");
		
		System.out.println("Account data: ");
		System.out.println(usr.toString());
		
		System.out.println("");
		
		System.out.print("Enter a deposit value: ");
		usr.deposit(sc.nextDouble());
		
		System.out.println("");
		System.out.println("Updated account data: ");
		System.out.println(usr.toString());
		
		System.out.print("Enter a withdraw value: ");
		usr.withdraw(sc.nextDouble());
		
		System.out.println("Updated account data: ");
		System.out.println(usr.toString());
		
	}

}
