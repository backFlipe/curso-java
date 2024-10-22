package application;

import java.util.Scanner;

import services.PrintService;

public class Programm {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> print = new PrintService<>();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			print.addValue(value);
		}
		
		print.print();
		Integer x = print.first();
		System.out.println("First: " + x);

	}

}
