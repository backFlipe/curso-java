package exFor4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
		//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
		
		Scanner sc = new Scanner (System.in);
		
		int n;
		double res, divisor, dividendo;
		
		System.out.println("Digite um número inteiro: ");
		n = sc.nextInt();
		
		for (int cont = 0; cont < n; cont++) {
			System.out.println("Informe o divisor: ");
			divisor = sc.nextInt();
			
			System.out.println("Informe o dividendo: ");
			dividendo = sc.nextInt();
			
			if (dividendo == 0) {
				System.out.println("Divisão impossível!");
				
			}else {
				res = divisor/dividendo;
				System.out.printf("O resultado da divisão é: %.1f\n", res);
				
			}
			
		}
		
	}

}
