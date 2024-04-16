package exFor3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
		//de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
		//conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
		//peso 5.
		
		Scanner sc = new Scanner (System.in);
		
		int n, cont;
		double x, y, z, media;
		
		System.out.println("Digite um valor inteiro: ");
		n = sc.nextInt();
		
		for (cont = 0; cont < n; cont++) {
			System.out.println("Digite o primeiro valor: ");
			x = sc.nextDouble();
			System.out.println("Digite o segundo valor: ");
			y = sc.nextDouble();
			System.out.println("Digite o terceiro valor: ");
			z = sc.nextDouble();
			
			media = ((x * 2) + (y * 3) + (z * 5))/ 10;
			
			System.out.printf("A média ponderada dos valores é: %.1f", media);
			
		}

	}

}
