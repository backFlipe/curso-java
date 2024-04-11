package exercicio6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
		//mostre:
		//a) a área do triângulo retângulo que tem A por base e C por altura.
		//b) a área do círculo de raio C. (pi = 3.14159)
		//c) a área do trapézio que tem A e B por bases e C por altura.
		//d) a área do quadrado que tem lado B.
		//e) a área do retângulo que tem lados A e B.
		
		double a, b, c, pi, areaTri, areaCirc, areaTrap, areaQuad, areaRet;
		
		pi = 3.14159;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor de A: ");
			a = sc.nextDouble();
		System.out.println("Informe o valor de B: ");
			b = sc.nextDouble();
		System.out.println("Informe o valor de C: ");
			c = sc.nextDouble();
		
		areaTri = (a * c)/2;
		
		System.out.printf("TRIÂNGULO: %.3f\n", areaTri);
		
		areaCirc = pi * Math.pow(c, 2);
		
		System.out.printf("CÍRCULO: %.3f\n", areaCirc);
		
		areaTrap = ((a + b) * c)/2;
		
		System.out.printf("TRAPÉZIO: %.3f\n", areaTrap);
		
		areaQuad = Math.pow(b, 2);
		
		System.out.printf("QUADRADO: %.3f\n", areaQuad);
		
		areaRet = a * b;
		
		System.out.printf("RETÂNGULO: %.3f\n", areaRet);
		
		sc.close();
		
		
	}

}
