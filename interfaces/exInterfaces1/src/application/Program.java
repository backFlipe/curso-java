package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PayPalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		ContractService cs = new ContractService(new PayPalService());
		
		System.out.println("Enter with de contract data: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (DD/MM/YYYY): ");
		LocalDate date = LocalDate.parse(sc.next(), dtf);
		System.out.print("Contract value: ");
		double value = sc.nextDouble();
		System.out.print("How many installments? ");
		int installments = sc.nextInt();
		
		Contract cont = new Contract(number, date, value);
		
		cs.processContract(cont, installments);
		
		System.out.println("INSTALLMENTS: ");
		for (Installment inst : cont.getInstallments()) {
			System.out.println(inst);
		}

		sc.close();
	}

}
