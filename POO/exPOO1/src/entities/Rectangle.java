package entities;

public class Rectangle {
	
	public double width;
	public double height;

	public double area () {
		double area = width * height;
		return area;
		
	}
	
	public double perimeter () {
		double perimeter = (height * 2) + (width * 2);
		return perimeter;
		
	}
	
	public double diagonal () {
		double diagonal = Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
		return diagonal;
		
	}
	
}