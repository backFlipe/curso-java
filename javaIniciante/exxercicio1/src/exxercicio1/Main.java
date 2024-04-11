package exxercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
		//mensagem explicativa, conforme exemplos.
		
		int num1, num2, soma;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
			num1 = sc.nextInt();
		System.out.println("Digite um número inteiro: ");
			num2 = sc.nextInt();
			
			soma = num1 + num2;
			
		System.out.println("O primeiro número digitado foi: " + num1);
		System.out.println("O segundo número digitado foi: " + num2);
			
		System.out.println("A soma dos números é: " + soma);
		
		
	}

}
