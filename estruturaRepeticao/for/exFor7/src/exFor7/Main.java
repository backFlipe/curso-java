package exFor7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
		//começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
		//exemplo.

		Scanner sc = new Scanner (System.in);
		
		int num;
		double quadrado, cubo;
		quadrado = 1;
		cubo = 1;
		
		System.out.println("Digite um número inteiro positivo: ");
		num = sc.nextInt();
		
		for (int cont = 1; cont <= num; cont++) {
			quadrado = Math.pow(cont, 2);
			cubo = Math.pow(cont, 3);
			System.out.printf("%d %.0f %.0f\n", cont, quadrado, cubo);
			
		}
		
	}

}
