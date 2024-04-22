package exPOO1;

import java.util.Scanner;
import java.util.Locale;
import entities.Rectangle;

public class Application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		Rectangle retangulo = new Rectangle();
		
		System.out.println("Enter the rectangle height and width: ");
		retangulo.height = sc.nextDouble();
		retangulo.width = sc.nextDouble();
		
		double area = retangulo.area();
		
		System.out.printf("Area = %.2f\n", retangulo.area());
		
		System.out.printf("Perímetro = %.2f\n", retangulo.perimeter());
		
		System.out.printf("Diagonal = %.2f\n", retangulo.diagonal());
		
		sc.close();
	}

}
