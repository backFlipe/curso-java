package exVet2;

import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia N números reais e armazene-os em um vetor. Em
		 * seguida: - Imprimir todos os elementos do vetor - Mostrar na tela a soma e a
		 * média dos elementos do vetor
		 */
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantos números você vai digitar?");
		int n = sc.nextInt();
		
		double [] vect = new double[n];
		
		double soma = 0;
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite o número: ");
			vect[i] = sc.nextDouble();
			soma += vect[i];
			
		}
		
		double media = soma / vect.length;
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("SOMA: " + soma);
		System.out.println("MÉDIA: " + media);
		
		sc.close();
		
	}

}
