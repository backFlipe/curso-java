package exEnum;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entitites.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Insert the department's name: ");
		String departName = sc.nextLine();
		
		System.out.println("Enter the worker data: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		
		System.out.print("Base salary: ");
		double bSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), bSalary, new Department(departName));
		
		System.out.print("How much contracts to this worker?");
		int cont = sc.nextInt();
		
		for (int i = 0; i < cont; i++) {
			System.out.printf("Enter contract #%d data: \n", i + 1);
			System.out.print("Date (dd/MM/yyyy): ");
			Date contDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double valPerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			double hours = sc.nextDouble();
			
			HourContract contract = new HourContract(contDate, valPerHour, hours);
			worker.addContract(contract);
			
		}
		
		System.out.printf("Enter month and year to calculate income (MM/yyyy): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + worker.income(year, month));

		sc.close();
		
	}

}
