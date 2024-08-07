package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programm {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Posição inválida!");
		}
		catch (InputMismatchException e) {
			System.out.println("A posição deve ser um número inteiro!");
		}
		
		System.out.println("Fim do programa");
		
		sc.close();
	}

}
