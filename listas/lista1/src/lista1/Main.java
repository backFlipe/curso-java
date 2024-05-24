package lista1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import entities.Employee;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		List <Employee> list = new ArrayList<>();
		
		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Employee #%d :\n", i + 1);
			System.out.printf("Id: \n");
			sc.nextLine();
			int id = sc.nextInt();
			sc.nextLine();
			System.out.printf("Name: \n");
			String name = sc.nextLine();
			System.out.println("Salary: ");
			double salary = sc.nextDouble();
			
			list.add(new Employee(name, salary, id));
			
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have the salary increased: ");
		int id = sc.nextInt();
		
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist! ");
			
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextInt();
			emp.increaseSalary(percentage);	
			
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		
		for (Employee obj : list) {
			System.out.println(obj);
			
		}
		
		sc.close();

	}

}
