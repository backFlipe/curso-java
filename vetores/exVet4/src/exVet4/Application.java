package exVet4;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em
		 * seguida, mostre na tela todos os números pares, e também a quantidade de
		 * números pares.
		 */

		Scanner sc = new Scanner (System.in);
		
		int quantPar = 0;
		
		System.out.println("Quantos números serão digitados? ");
		int n = sc.nextInt();
		
		int [] vect = new int[n];
		
		for (int i = 0; i < n; i++ ) {
			System.out.println("Número: ");
			vect[i] = sc.nextInt();
			
		}
		
		System.out.println("NÚMEROS PARES: ");
		
		for (int i = 0; i < n; i++) {
			if (vect[i] % 2 == 0) {
				System.out.println(vect[i]);
				quantPar += 1;
				
			}
			
		}
		
		System.out.println("QUANTIDADE DE PARES = " + quantPar);
		
		
	}

}
