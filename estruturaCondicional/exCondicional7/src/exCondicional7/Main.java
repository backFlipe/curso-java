package exCondicional7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
		//de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
		//ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
	    //Se o ponto estiver na origem, escreva a mensagem “Origem”.
		//Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
		//situação.
		
		double x, y;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe o valor de x: ");
		x = sc.nextDouble();
		
		System.out.println("Informe o valor de y: ");
		y = sc.nextDouble();

		if (x > 0 && y > 0) {
			System.out.println("Quadrante Q1");
			
		}
		
		else if (x < 0 && y > 0) {
			System.out.println("Quadrante Q2");
			
		}
		
		else if (x < 0 && y < 0) {
			System.out.println("Quadrante Q3");
			
		}
		
		else if (x > 0 && y < 0) {
			System.out.println("Quadrante Q4");
			
		}
		
		else if (x == 0 && y != 0) {
			System.out.println("Eixo X");
			
		}
		
		else if (y == 0 && x != 0) {
			System.out.println("Eixo Y");
			
		}
		
		else if (x == 0 && y ==0) {
			System.out.println("Origem");
			
		}
		
		
	}

}
