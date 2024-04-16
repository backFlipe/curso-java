package exFor1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
		//X, se for o caso.
		
		Scanner sc = new Scanner (System.in);
		
		int x, cont;

		System.out.println("Insira um valor inteiro entre 1 e 1000: ");
		x = sc.nextInt();
		
		for (cont = 1; cont <= x; cont++) {
			if (cont % 2 != 0) {
				System.out.println(cont);
				
			}
			
		}
		
	}

}
