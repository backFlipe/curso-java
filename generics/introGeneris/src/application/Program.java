package application;

import java.util.Scanner;

import model.services.PrintService;

public class Program {

	public static void main(String[] args) {
		
		/*PARA ESSA SOLUÇÃO FOI UTILIZADA UMA CLASSE GENÉRICA "PrintService<T>", O QUE PERMITE O
		 *REUSO DA CLASSE, GARANTE TYPE SAFETY E AUMENTA A PERFORMANCE 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		PrintService<Double> ps = new PrintService<>();
		
		System.out.println("How many values? ");
		int n = sc.nextInt();

		
		for (int i = 0; i < n; i++) {
			double value = sc.nextDouble();
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println("First: " + ps.first());
		
		sc.close();
	}

}
