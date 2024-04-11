package exCondicional5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
		//seguir, calcule e mostre o valor da conta a pagar.
		
		Scanner sc = new Scanner(System.in);

		int codigo, quant;
		double preco, valorFinal;
		preco = 0;
		
		System.out.println("Escolha um item: ");
		System.out.println("[1] Cachorro-Quente;   Preço: R$4,00");
		System.out.println("[2] X-Salada;  Preço: R$4,50");
		System.out.println("[3] X-Bacon;  Preço: R$5,00");
		System.out.println("[4] Torrada Simples;  Preço: R$2,00");
		System.out.println("[5] Refrigerante;  Preço: R$1,50");
		codigo = sc.nextInt();
		
		System.out.println("Qual a quantidade?");
		quant = sc.nextInt();
		
		if (codigo == 1) {
			preco = 4;
		}
		
		else if (codigo == 2) {
			preco = 4.5;
		}
		
		else if (codigo == 3) {
			preco = 5;
		}
		
		else if (codigo == 4) {
			preco = 2;
			
		}
		
		else if (codigo == 5) {
			preco = 1.5;
		}
		
		else {
			System.out.println("CÓDIGO DE PRODUTO INVÁLIDO!");
			
		}
		
		valorFinal = quant * preco;
		
		System.out.printf("Valor total: R$%.2f\n", valorFinal);
		
	}

}
