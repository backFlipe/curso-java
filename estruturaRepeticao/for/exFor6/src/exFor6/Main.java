package exFor6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Ler um número inteiro N e calcular todos os seus divisores.
		
		Scanner sc = new Scanner (System.in);
		
		int num, cont;
		
		System.out.println("Digite um número inteiro: ");
		num = sc.nextInt();
		
		for (cont = 1; cont <= num; cont++) {
			if (num % cont == 0) {
				System.out.println(cont);
				
			}
			
		}
		
	}

}
