package exVet10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um conjunto de N nomes de alunos, bem como as
		 * notas que eles tiraram no 1º e 2º semestres. Cada uma dessas informações deve
		 * ser armazenada em um vetor. Depois, imprimir os nomes dos alunos aprovados,
		 * considerando aprovados aqueles cuja média das notas seja maior ou igual a 6.0
		 * (seis).
		 */
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantos alunos?");
		int n = sc.nextInt();
		
		String [] nome = new String [n];
		
		double [] nota1 = new double [n];
		double [] nota2 = new double [n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Digite o nome do %d° aluno: ", i + 1);
			sc.nextLine();
			nome[i] = sc.nextLine();
			System.out.println("Nota 1: ");
			nota1[i] = sc.nextDouble();
			System.out.println("Nota 2: ");
			nota2[i] = sc.nextDouble();
			
		}
		
		System.out.println("Alunos aprovados: ");
		
		for (int i = 0; i < n; i++) {
			if ((nota1[i] + nota2[i]) / 2 >= 6) {
				System.out.println(nome[i]);
				
			}
			
		}
		
		
		sc.close();
		

	}

}
