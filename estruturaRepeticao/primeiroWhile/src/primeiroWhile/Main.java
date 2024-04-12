package primeiroWhile;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Ler números até identificar um 0 e então mostrar a soma de todos os números digitados.
		
		int num, soma;
		soma = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite os números que deseja ver a soma (0 para encerrar)");
		num = sc.nextInt();
		
		while (num != 0) {
			soma += num;
			num = sc.nextInt();
			
		}
		
		System.out.println("A soma dos números é: " + soma);
		
		sc.close();
		

	}

}
