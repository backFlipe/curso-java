package exFor5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
		//Lembrando que, por definição, fatorial de 0 é 1.
		
		Scanner sc = new Scanner (System.in);
		
		int num, fat;
		fat = 1;
		
		System.out.println("Digite um valor inteiro: ");
		num = sc.nextInt();
		
		for (int cont = 1; cont <= num; cont++) {
			fat = fat * cont;
			
		}
		
		System.out.println(fat);

	}

}
