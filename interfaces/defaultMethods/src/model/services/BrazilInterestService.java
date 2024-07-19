package model.services;

import java.security.InvalidParameterException;

public class BrazilInterestService implements InterestService {

	private double interestRate;

	public BrazilInterestService(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}
	
	public double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("Can not be 0 months!");
		}
		return amount * Math.pow(1 + interestRate/100, months);
	}
}
