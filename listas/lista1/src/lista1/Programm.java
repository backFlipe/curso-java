package lista1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Programm {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		List <Employee> list = new ArrayList<>();
		
		System.out.println("How many employees will be registered?");
		int quantity = sc.nextInt();
		
		for (int i = 1; i <= quantity; i++) {
			System.out.printf("Employee %d: \n", i);
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			Employee emp = new Employee(name, id, salary);
			list.add(emp);
		}
		
		System.out.print("Enter the employee id that will have the salary increased: ");
		int idSalary = sc.nextInt();
		
		Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		
		if (emp == null) {
			System.out.println("This id does not exist");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		for (Employee e : list) {
			System.out.println(e);
		}
		
		
		
		sc.close();

	}

}
