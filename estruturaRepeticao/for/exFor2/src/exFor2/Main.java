package exFor2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
		//Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
		//essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo)

		Scanner sc = new Scanner (System.in);
		
		int n, x, cont;
		
		System.out.println("DIgite um valor inteiro: ");
		n = sc.nextInt();
		
		for (cont = 0; cont < n; cont++) {
			x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				System.out.println(x + " in");
				
			} else {
				System.out.println(x + " out");
				
			}
			
		}
		
	}

}
