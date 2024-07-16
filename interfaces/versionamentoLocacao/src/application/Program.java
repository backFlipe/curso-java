package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import services.BrazilTaxServices;
import services.RentalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.print("Enter with the rental data");
		System.out.print("Car model: \n");
		String model = sc.nextLine();
		System.out.print("Start (DD/MM/YYYY hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);
		System.out.print("Finish (DD/MM/YYYY hh:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);
		
		CarRental cr = new CarRental(start, finish, new Vehicle(model));
		
		System.out.print("Enter the price per hour: ");
		double pricePerHour = sc.nextDouble();
		System.out.print("Enter the price per day: ");
		double pricePerDay = sc.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxServices());
		
		rentalService.processInvoice(cr);
		
		System.out.println("INVOICE: ");
		System.out.println("Basic Payment: " + cr.getInvoice().getBasicPayment());
		System.out.println("Taxes: " + cr.getInvoice().getTax());
		System.out.println("Total Payment: " + cr.getInvoice().getTotalPayment());
		
		sc.close();
	}

}
