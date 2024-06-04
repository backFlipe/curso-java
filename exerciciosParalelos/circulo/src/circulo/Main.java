package circulo;

import java.util.Scanner;
import java.util.Locale;
import entities.Circle;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the radius: ");
		Circle.radius = sc.nextDouble();

		System.out.println("Area = " + Circle.area());
		System.out.println("Perimeter = " + Circle.perimeter());

	}

}
