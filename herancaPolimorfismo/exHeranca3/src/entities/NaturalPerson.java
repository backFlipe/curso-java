package entities;

public class NaturalPerson extends Person {

	private Double healthExpenditures;
	
	public NaturalPerson() {
		super();
	}
	
	public NaturalPerson(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	
	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double totalTaxes() {
		if (super.getAnualIncome() < 20000) {
			return 0.15 * super.getAnualIncome() - (healthExpenditures / 2);
		}
		else {
			return 0.25 * super.getAnualIncome() - (healthExpenditures / 2);
		}
	}

}
