package pensionato;

import java.util.Scanner;
import entities.Rent;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Rent[] vect = new Rent[10];
		
		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Rent #%d: \n", i + 1);
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("E-Mail: ");
			String email = sc.next();
			System.out.println("Room: ");
			int room = sc.nextInt();
			
			vect[room] = new Rent(name, email);
			
		}
		
		System.out.println("Busy rooms: ");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
				
			}
			
		}
		
		
		sc.close();
		

	}

}
