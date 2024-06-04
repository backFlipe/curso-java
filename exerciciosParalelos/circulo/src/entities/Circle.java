package entities;

public class Circle {
	
	public static double radius;
	public static double area;
	public static double perimeter;
	public static double PI = 3.14;
	
	public static double area () {
		return area = PI * Math.pow(radius, 2);
		
	}
	
	public static double perimeter () {
		return perimeter = 2 * PI * radius;
		
	}
	
}
