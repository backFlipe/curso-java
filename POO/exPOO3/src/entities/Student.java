package entities;

public class Student {
	
	public String name;
	public double first;
	public double second;
	public double third;
	
	public double finalNote() {
		return first + second + third;
		
	}
	
	public void passFail() {
		if (finalNote() >= 60) {
			System.out.println("PASS");
			
		}
		else {
			System.out.println("FAIL");
			double missing = 60 - finalNote();
			System.out.println("Missing: " + missing);
			
		}
		
		
	}

}
