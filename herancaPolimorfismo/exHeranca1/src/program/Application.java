package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		List <Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.printf("Employee #%d data: \n", i);
			System.out.print("Outsourced? (y/n) ");
			char resp = sc.next().charAt(0);
			
			if (resp == 'n') {
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Hours: ");
				int hours = sc.nextInt();
				System.out.print("Value per hour: ");
				double vPerH = sc.nextDouble();
				
				Employee emp = new Employee(name, hours, vPerH);
				list.add(emp);	
			}
			else if(resp == 'y') {
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Hours: ");
				int hours = sc.nextInt();
				System.out.print("Value per hour: ");
				double vPerH = sc.nextDouble();
				System.out.print("Additional charge: ");
				double addCharge = sc.nextDouble();
				
				Employee emp = new OutsourceEmployee(name, hours, vPerH, addCharge);
				list.add(emp);
			}
			else {
				System.out.println("Not an option!");
			}
		}
		
		System.out.println("PAYMENTS");
		
		System.out.println(list);
		
		sc.close();
	}

}
