package condicional1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		num = sc.nextInt();
		
		if (num > 0) {
			System.out.println("O número digitado é POSITIVO!");
		}
		
		else if (num < 0) {
			System.out.println("O número digitado é NEGATIVO!");
		}
		
		else {
			System.out.println("O número digitado é NEUTRO!");
		}
		
	}

}
