package entradaDados;

import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String x;
		int y;
		double z;
		char a;

		System.out.println("Digite uma palavra: ");
		x = sc.next();
		System.out.println("Digite um número inteiro: ");
		y = sc.nextInt();
		System.out.println("Digite um número real: ");
		z = sc.nextDouble();
		System.out.println("Digite um caractere: ");
		a = sc.next().charAt(0);
		
		
		System.out.println("Palavra: " + x);
		System.out.println("Número inteiro: " + y);
		System.out.println("Número real: " + z);
		System.out.println("Caractere: " + a);


		sc.close();
	}

}
