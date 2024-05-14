package util;

public class Formula {
	
	public static double velocity = 1;
	public static double time = 1;
	public static double displacement = 1;
	public static int option;
	
	public static void velocity () {
		velocity = displacement/time;
		System.out.println("The velocity was: " + velocity + " m/s");
		
	}
	
	public static void time () {
		time = displacement / velocity;
		System.out.println("The time was: " + time + " seconds");
		
	}
	
	public static void displacement () {
		displacement = time * velocity;
		System.out.println("The displacement was: " + displacement + " meters");
		
	}
	
}
