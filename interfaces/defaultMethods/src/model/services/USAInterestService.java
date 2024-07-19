package model.services;

import java.security.InvalidParameterException;

public class USAInterestService implements InterestService{

	private double interestRate;

	public USAInterestService(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}


}
