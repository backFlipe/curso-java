package exPOO2;

import java.util.Locale;

import java.util.Scanner;

import entities.Employee;

public class Application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		Employee funcionario  = new Employee();
		
		System.out.print("Name: ");		
		funcionario.name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		funcionario.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		funcionario.tax = sc.nextDouble();
		
		System.out.println("Employee: " + funcionario);
		
		System.out.print("Which percentage to increase salary? ");
		double porcentagem = sc.nextDouble();
		
		funcionario.increaseSalary(porcentagem);
		
		System.out.printf("Updated data: " + funcionario);
		
	}

}
