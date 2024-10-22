package application;

import java.util.Scanner;

import model.entities.Account;
import model.exception.DomainException;

public class Programm {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		try {
			System.out.println("Enter account data: ");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			sc.nextLine();
			System.out.print("Initial balance: ");
			double initialBalance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			
			Account acc = new Account(number, holder, initialBalance, withdrawLimit);
			System.out.println();
			
			System.out.print("Enter ammount for withdraw: ");
			acc.withdraw(sc.nextDouble());
			System.out.println("New balance: " + acc.getBalance());
		}
		catch(DomainException e) {
			System.out.println(e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Unexpected error");
		}
		
		sc.close();
	}

}
