package application;

import java.util.Scanner;

import model.services.PrintStringService;

public class Program {
	
	//PARA ESSA SOLUÇÃO FOI NECESSÁRIA A CRIAÇÃO DE DUAS CLASSES, UMA PARA CADA TIPO GENÉRICO

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PrintStringService ps = new PrintStringService();
		
		System.out.println("How many values? ");
		int n = sc.nextInt();

		
		for (int i = 0; i < n; i++) {
			String value = sc.next();
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println("First: " + ps.first());
	}

}
