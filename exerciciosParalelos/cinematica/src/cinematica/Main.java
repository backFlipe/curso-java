package cinematica;

import util.Formula;
import java.util.Scanner;
import java.util.Locale;

//Aplicação que usa a fórmula da velocidade para determinar a velocidade, tempo ou deslocamento;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("What do you want to know?");
		System.out.println("Velocity-------[1]");
		System.out.println("Time-----------[2]");
		System.out.println("Displacement---[3]");
		Formula.option = sc.nextInt();
		
		switch (Formula.option) {
		case 1:
			System.out.print("How much time?(s) ");
			Formula.time = sc.nextDouble();
			System.out.print("How much displacement?(m) ");
			Formula.displacement = sc.nextDouble();
			
			Formula.velocity();
			
		break;
		
		case 2: 
			System.out.print("How much velocity?(m/s) ");
			Formula.velocity = sc.nextDouble();
			System.out.print("How much displacement?(m) ");
			Formula.displacement = sc.nextDouble();
			
			Formula.time();
			
		break;
		
		case 3:
			System.out.print("How much velocity?(m/s) ");
			Formula.velocity = sc.nextDouble();
			System.out.println("How much time?(s) ");
			Formula.time = sc.nextDouble();
			
			Formula.displacement();
			
		break;
		
		default: 
			System.out.println("Invalid Code!");
		
		break;
			
		}
		

	}

}
