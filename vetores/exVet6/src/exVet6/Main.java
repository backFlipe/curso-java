package exVet6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em
		 * seguida, gere um terceiro vetor C onde cada elemento de C é a soma dos
		 * elementos correspondentes de A e B. Imprima o vetor C gerado.
		 */
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantos valores cada vetor terá? ");
		int n = sc.nextInt();
		
		int [] vetA = new int [n];
		int [] vetB = new int [n];
		int [] vetC = new int [n];
		
		System.out.println("Digite os valores do vetor A: ");
		
		for (int i = 0; i < n; i++) {
			vetA[i] = sc.nextInt();
			
		}
		
		System.out.println("Digite os valores do vetor B: ");
		
		for (int i = 0; i < n; i++) {
			vetB[i] = sc.nextInt();
			
		}
		
		System.out.println("VETOR RESULTANTE: ");
		
		for (int i = 0; i < n; i++) {
			vetC[i] = vetA[i] + vetB[i];
			System.out.println(vetC[i]);
			
		}
		
		sc.close();

	}

}
