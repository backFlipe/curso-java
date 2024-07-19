package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		
		List <Employee> list = new ArrayList<>();
		
		String path = "/home/back-flipe/eclipse-workspace/curso-java/interfaces/interfaceComparable/file";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String empCsv = br.readLine();
			while (empCsv != null) {
				String [] vect = empCsv.split(",");
				list.add(new Employee(vect[0], Double.parseDouble(vect[1])));
				empCsv = br.readLine();
			}
			Collections.sort(list);
			for (Employee emp : list) {
				System.out.println(emp.getName() + ", " + emp.getSalary());
				}
			
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
