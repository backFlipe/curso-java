package exVet9;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas
		 * idades. Os nomes devem ser armazenados em um vetor, e as idades em um outro
		 * vetor. Depois, mostrar na tela o nome da pessoa mais velha.
		 */
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantas pessoas vai digitar? ");
		int n = sc.nextInt();
		
		int maiorIdade = 0;
		
		int [] idades = new int [n];
		String [] nomes = new String [n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Digite os dados da %da pessoa: \n", i + 1);
			System.out.println("Nome: ");
			sc.nextLine();
			nomes[i] = sc.nextLine();
			
			System.out.println("Idade: ");
			idades[i] = sc.nextInt();
			
		}
		
		for (int i = 0; i < n; i++) {
			if (idades[i] > maiorIdade) {
				maiorIdade = idades[i];
				
			}
			
		}
		
		System.out.println("Pessoa mais velha: ");
		
		for (int i = 0; i < n; i++) {
			if(idades[i] == maiorIdade) {
				System.out.println(nomes[i]);
				
			}			
		}
		
		sc.close();
		
	}

}
