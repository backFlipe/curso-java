package exVet5;

import java.util.Scanner;	

public class Main {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia N números reais e armazene-os em um vetor. Em
		 * seguida, mostrar na tela o maior número do vetor (supor não haver empates).
		 * Mostrar também a posição do maior elemento, considerando a primeira posição
		 * como 0 (zero).
		 */	
		
		Scanner sc = new Scanner (System.in);
		
		double maior = 0;
		int posicao = 0;
		
		System.out.println("Quantos números serão digitados? ");
		int n = sc.nextInt();
		
		double [] vect = new double [n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Número: ");
			vect[i] = sc.nextInt();
			
			if (vect[i] > maior) {
				maior = vect[i]; 
				posicao = i;
				
			}
			
		}
		
		System.out.println("Maior valor = " + maior);
		System.out.println("Posição do maior valor = " + posicao);
		

	}

}
