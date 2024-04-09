package exercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
		//casas decimais conforme exemplos.
		
		double raio, area, pi;
		
		pi = 3.14159;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio do círculo: ");
			raio = sc.nextDouble();
			
			area = pi * Math.pow(raio, 2);
			
		System.out.printf("A área do círculo de raio %.2f é: %.4f\n", raio, area);

	}

}
