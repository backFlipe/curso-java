package exPOO3;

import java.util.Scanner;
import java.util.Locale;
import entities.Student;

public class Application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);

		Student aluno = new Student();
		
		System.out.print("Enter your name: ");
		aluno.name = sc.nextLine();
		
		System.out.println("Enter the three notes: ");
		aluno.first = sc.nextDouble();
		aluno.second = sc.nextDouble();
		aluno.third = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f\n", aluno.finalNote());
		
		aluno.passFail();
		
	}

}
