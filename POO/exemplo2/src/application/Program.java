package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		Product produto = new Product();
		
		System.out.println("Insira os dados do produto: ");
		System.out.print("Nome: ");
		produto.name = sc.nextLine();
		
		System.out.print("Preço: ");
		produto.price = sc.nextDouble();
		
		System.out.println("Quantidade em estoque: ");
		produto.quantity = sc.nextInt();
		
		System.out.println("Informações do produto" + produto);
		
		System.out.println();
		System.out.print("Informe quantos itens serão adicionados: ");
		int quantidade = sc.nextInt();
		
		produto.adicionarProduto(quantidade);
		
		System.out.println("Informações atualizadas: " + produto);
		
		System.out.print("Informe quantos itens serão retirados: ");
		quantidade = sc.nextInt();
		
		produto.removerProduto(quantidade);
		
		System.out.println("Informações atualizadas: " + produto);
		
		sc.close();
		
	}

}
