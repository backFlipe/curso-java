package model.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePayment;
	
	public ContractService(OnlinePaymentService onlinePayment) {
		this.onlinePayment = onlinePayment;
		
	}
	
	List <Installment> list = new ArrayList<>();
	
	public void processContract(Contract contract, int months) {
		double basicInstallment = contract.getTotalValue() / months;
		
		for (int i = 1; i <= months; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			double interest = onlinePayment.interest(basicInstallment, i);
			double fee = onlinePayment.paymentFee(basicInstallment + interest);
			double total = basicInstallment + fee + interest;
			contract.getInstallments().add(new Installment(dueDate, total));
		}
		
	}
	
}
