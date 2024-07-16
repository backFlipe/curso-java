package services;

public class BrazilTaxServices{
	
	public Double tax (Double ammount) {
		if (ammount <= 100) {
			return ammount * 0.2;
		}
		else {
			return ammount * 0.15;
		}
	}

}
