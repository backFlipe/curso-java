package exVet8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um vetor de N números inteiros. Em seguida,
		 * mostrar na tela a média aritmética somente dos números pares lidos, com uma
		 * casa decimal. Se nenhum número par for digitado, mostrar a mensagem
		 * "NENHUM NUMERO PAR"
		 */
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int [] vet = new int [n];
		
		int somaPar= 0, quantPar = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextInt();
			
		}
		
		for (int i = 0; i < n; i++) {
			if (vet[i] % 2 == 0) {
				somaPar += vet[i];
				quantPar++;
				
			}
			
		}
		
		if (quantPar == 0) {
			System.out.println("NENHUME NÚMERO PAR!");		
		}
		
		else {
			double mediaPar = somaPar / quantPar;
			
			System.out.printf("Média dos números pares: %.1f", mediaPar);
			
		}
			
		
		
		sc.close();

	}

}
