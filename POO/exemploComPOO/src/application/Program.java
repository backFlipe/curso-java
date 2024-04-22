package application;

import java.util.Scanner;

import entities.Triangle;

import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		double areax, areay, p;
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe as 3 medidas dos lados do triângulo X");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextInt();

		System.out.println("Informe as 3 medidas dos lados do triângulo Y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		areax = x.area();

		areay = y.area();

		System.out.println("Área do triângulo X: " + areax);
		System.out.println("Área do triângulo Y: " + areay);

		if (areax > areay) {
			System.out.println("Área maior: Triângulo X");

		} else if (areay > areax) {
			System.out.println("Área maior: Triângulo Y");

		} else {
			System.out.println("Áreas iguais");

		}

	}

}
