package exVet11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas.
		 * Fazer um programa que calcule e escreva a maior e a menor altura do grupo, a
		 * média de altura das mulheres, e o número de homens.
		 */

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantas pessoas? ");
		int n = sc.nextInt();
		
		double [] alt = new double [n];
		
		char gen, aux;
		double somaM = 0, quantH = 0, quantM = 0, menorAlt, maiorAlt, mediaM = 0;
		
		menorAlt = alt[0];
		maiorAlt = alt[0];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Altura da %da pessoa: ", i + 1);
			alt[i] = sc.nextDouble();
			
			System.out.println("Gênero: ");
			gen = sc.next().charAt(0);
			
			aux = Character.toLowerCase(gen);
			
			if (aux == 'm') {
				quantH++;

			}
			else if(aux == 'f') {
				quantM++;
				somaM += alt[i];
				
			}
			
		}
		
		for (int i = 1; i < n; i++) {
			if (alt[i] > maiorAlt) {
				maiorAlt = alt[i];
				
			}
			
			if (alt[i] < menorAlt) {
				menorAlt = alt[i];
				
			}
			
		}
		
		mediaM = somaM / quantM;
		
		System.out.println("Menor altura: " + menorAlt);
		System.out.println("Maior altura: " + maiorAlt);
		
		System.out.printf("Média da altura das mulheres %.2f\n", mediaM);
		System.out.println("Quantidade de homens: " + quantH);
		
	}

}
