package entities;

public class SavingsAccount extends Account {

	private Double interestRate;

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	//RECOMENDA-SE USAR "final" EM MÉTODOS OVERRIDE POR QUESTÕES DE DESEMPENHO E SEGURANÇA
	@Override
	public final void withDraw(Double ammount) {
		balance -= ammount;
	}
}
