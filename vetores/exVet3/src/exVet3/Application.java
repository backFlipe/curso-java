package exVet3;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme
		 * exemplo. Depois, mostrar na tela a altura média das pessoas, e mostrar também
		 * a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas
		 * pessoas caso houver.
		 */
		
		Scanner sc = new Scanner (System.in);
		
		double media, soma = 0, minor = 0;
		
		System.out.println("Qual o número de pessoas?");
		int n = sc.nextInt();
		
		double [] alt = new double [n];
		
		String [] name = new String [n];
		
		int [] age = new int [n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Nome: ");
			sc.nextLine();
			name[i] = sc.nextLine();
			
			System.out.println("Idade: ");
			age[i] = sc.nextInt();
			
			System.out.println("Altura: ");
			alt[i] = sc.nextDouble();
			
			soma += alt[i];
			
		}
		
		media = soma / n;
		
		System.out.println("Altura média: " + media);
		
		for (int i = 0; i < n; i++) {
			if (age[i] < 16) {
				minor = minor + 1;
				
			}
			
		}
		
		double pcnt = (minor/n) * 100;
		
		System.out.println("Pessoas menores de 16: " + pcnt + "%");
		
		for (int i = 0; i < n; i++) {
			if (age[i] < 16) {
				System.out.println(name[i]);
			}
			
		}

	}

}
