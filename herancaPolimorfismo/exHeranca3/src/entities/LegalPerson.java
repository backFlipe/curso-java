package entities;

public class LegalPerson extends Person {

	private Integer numberOfEmployees;
	
	public LegalPerson() {
		super();
	}
	
	public LegalPerson(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double totalTaxes() {
		if (numberOfEmployees > 10) {
			return super.getAnualIncome() * 0.14;
		}
		else {
			return super.getAnualIncome() * 0.16;
		}
	}

}
