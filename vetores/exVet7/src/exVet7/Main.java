package exVet7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro N e depois um vetor de N números
		 * reais. Em seguida, mostrar na tela a média aritmética de todos elementos com
		 * três casas decimais. Depois mostrar todos os elementos do vetor que estejam
		 * abaixo da média, com uma casa decimal cada.
		 */
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double [] vet = new double [n];
		
		double media, soma = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite um número: ");
			vet[i] = sc.nextDouble();
			
			soma += vet[i];
			
		}
		
		media = soma / n;
		
		System.out.printf("Média do vetor: %.3f\n", media);
		
		System.out.println("Elementos abaixo da média: ");
		
		for (int i = 0; i < n; i++) {
			if (vet[i] < media) {
				System.out.printf("%.1f\n", vet[i]);
				
			}
			
		}
		
		sc.close();
		

	}

}
