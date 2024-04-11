package exercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
		//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

		int codigo1, quant1, codigo2, quant2;
		double preco1, preco2, precoTotal;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o codigo da primeira peça: ");
			codigo1 = sc.nextInt();
		System.out.println("Informe o número de peças: ");
			quant1 = sc.nextInt();
		System.out.println("Informe o valor unitário da peça: ");
			preco1 = sc.nextDouble();
		System.out.println("Informe o código da segunda peça: ");
			codigo2 = sc.nextInt();
		System.out.println("Informe o número de peças: ");
			quant2 = sc.nextInt();
		System.out.println("Informe o valor unitário da peça: ");
			preco2 = sc.nextDouble();
			
		precoTotal = (preco1 * quant1) + (preco2 * quant2);
		
		System.out.printf("Preço total a se pagar = R$%.2f", precoTotal);
			
			
		
		
		sc.close();
		
	}
	

}
