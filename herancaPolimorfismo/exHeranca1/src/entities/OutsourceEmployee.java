package entities;

public final class OutsourceEmployee extends Employee{

	private Double additionalCharge;
	
	public OutsourceEmployee() {
		
	}

	public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double additinalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additinalCharge;
	}

	public Double getAdditinalCharge() {
		return additionalCharge;
	}

	public void setAdditinalCharge(Double additinalCharge) {
		this.additionalCharge = additinalCharge;
	}
	
	@Override
	public Double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName() + " - $" + payment() + "\n");
		return sb.toString();
	}
}
