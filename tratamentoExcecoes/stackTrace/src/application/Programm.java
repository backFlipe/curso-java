package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programm {

	public static void main(String[] args) {
		
		method1();
		
		System.out.println("Fim do programa");

	}
	
	public static void method1() {
		System.out.println("Método 1 COMEÇO");
		method2();
		System.out.println("Método 1 FINAL");
	}
	
	public static void method2() {
		
		System.out.println("Método 2 COMEÇO");
		
		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida!");
			e.printStackTrace();
			//pritStackTrace() MOSTRA O CAMINHO DE COMO OCORREU A EXCEÇÃO SEM ENCERRAR O PROGRAMA
		} 
		catch (InputMismatchException e) {
			System.out.println("A posição deve ser um número inteiro!");
			e.printStackTrace();
		}

		sc.close();
		
		System.out.println("Método 2 FINAL");
	}

}
