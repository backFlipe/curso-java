package exemploSemPOO;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
		válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
		possui a maior área.
		A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a
		seguinte (fórmula de Heron):
		*/
		
		double areax, areay, p, xa, xb, xc, ya, yb, yc;;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe as 3 medidas dos lados do triângulo X");
		xa = sc.nextDouble();
		xb = sc.nextDouble();
		xc = sc.nextInt();
		
		System.out.println("Informe as 3 medidas dos lados do triângulo Y");
		ya = sc.nextDouble();
		yb = sc.nextDouble();
		yc = sc.nextDouble();
		
		p = (xa + xb + xc)/2;
		
		areax = Math.sqrt(p * (p - xa) * (p - xb) * (p - xc));
		
		p = (ya + yb + yc)/2;
		
		areay = Math.sqrt(p * (p - ya) * (p - yb) * (p - yc));
		
		System.out.println("Área do triângulo X: " + areax);
		System.out.println("Área do triângulo Y: " + areay);

		if (areax > areay) {
			System.out.println("Área maior: Triângulo X");
			
		}
		else if (areay > areax){
			System.out.println("Área maior: Triângulo Y");
			
		}
		else {
			System.out.println("Áreas iguais");
			
		}
		
		
	}

}
