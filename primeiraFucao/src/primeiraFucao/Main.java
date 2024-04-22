package primeiraFucao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int a, b, c, maior;

		System.out.println("Digite 3 números: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		
		maior = max(a, b, c);
		
		mostraResultado(maior);
		
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
			
		}
		
		else if (y > z) {
			aux = y;
			
		}
		
		else {
			aux = z;
			
		}
		
		return aux;
		
	}
	
	public static void mostraResultado(int valor) {
		System.out.println("Maior = " + valor);
		
	}

}
