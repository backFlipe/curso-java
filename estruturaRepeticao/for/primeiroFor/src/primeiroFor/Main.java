package primeiroFor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int num, cont, soma, x;
		soma = 0;
		
		System.out.println("Insira um número inteiro: ");
		num = sc.nextInt();
		
		for (cont = 0; cont < num; cont++) {
			x = sc.nextInt();
			soma += x;
			
		}
		
		System.out.println("A soma é: " + soma);
		
		
	}

}
