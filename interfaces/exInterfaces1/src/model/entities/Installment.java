package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
	
	private LocalDate dueDate;
	private double amount;
	
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Installment(LocalDate dueDate, double amount) {
		this.dueDate = dueDate;
		this.amount = amount;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public double getAmount() {
		return amount;
	}
	
	@Override
	public String toString() {
		return dueDate.format(fmt) + " - " + String.format("%.2f", amount);
 	}

}
