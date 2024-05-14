package exemploVetor1;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira uma quantidade: ");
		int n = sc.nextInt();
		
		double[] vect = new double [n];
		
		double soma = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.println("Insira uma altura: ");
			vect[i] = sc.nextDouble();
			
			soma += vect[i];
			
		}
		
		double media = soma / n;
		
		System.out.println(media);
		
	}

}
