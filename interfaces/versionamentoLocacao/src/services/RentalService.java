package services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
	
	private Double pricePerHour;
	private Double pricePerDay;
	
	private BrazilTaxServices taxService;

	public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxServices taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}

	public Double getPricePerHour() {
		return pricePerHour;
	}

	public void setPricePerHour(Double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	public Double getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(Double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public BrazilTaxServices getTaxService() {
		return taxService;
	}

	public void setTaxService(BrazilTaxServices taxService) {
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		double hours = minutes/60;
		
		double payment;
		if (hours <= 12) {
			payment = pricePerHour * Math.ceil(hours);
		}
		else {
			payment = pricePerDay * Math.ceil(hours/24);
		}
		
		double tax = taxService.tax(payment);
		
		carRental.setInvoice(new Invoice(payment, tax));
	}
}
