package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.NaturalPerson;
import entities.Person;

public class Programm {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		List <Person> list = new ArrayList<>();
		
		System.out.println("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");	
			double anualIncome = sc.nextDouble();
			
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				
				list.add(new NaturalPerson(name, anualIncome, healthExpenditures));
			}
			else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				
				list.add(new LegalPerson(name, anualIncome, numberOfEmployees));
			}
		}
		
		System.out.println();
		System.out.println("Taxes paid: ");
		
		for (Person per : list) {
			System.out.println(per.getName() + ": $" + String.format("%.2f", per.totalTaxes()));
		}
		
		double sum = 0;
		for (Person per : list) {
			sum += per.totalTaxes();
		}
		
		System.out.println();
		System.out.println("Total taxes: $" + String.format("%.2f", sum));
		
		sc.close();
	}

}
