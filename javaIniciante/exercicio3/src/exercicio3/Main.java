package exercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
		//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		
		int a, b, c, d, diferenca;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva o primeiro valor: ");
			a = sc.nextInt();
		System.out.println("Escreva o segundo valor: ");
			b = sc.nextInt();
		System.out.println("Escreva o terceiro valor: ");
			c = sc.nextInt();
		System.out.println("Escreva o quarto valor: ");
			d = sc.nextInt();
		
			
			diferenca = (a *b) - (c* d);
			
		System.out.println("A diferença entre os produtos é: " + diferenca);
		

	}

}
