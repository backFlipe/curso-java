package entities;

public class Classes {
	
	private String classe;
	private int hp;
	
	public void setClasse(String classe) {
		this.classe = classe;
		
	}
	
	public String getClasse () {
		return classe;
		
	}
	
	public int getPV () {
		switch (classe) {
		case "Mago":
			hp = 5;
		break;
		
		case "Arqueiro":
			hp = 10;
		break;
		
		case "Guerreiro":
			hp = 15;
		break;
		
		case "Cavaleiro":
			hp = 20;
		break;
		
		default: 
			System.out.println("Classe inválida!");
			
		break;
		}
		return hp;
		
	}
	
	public String toString() {
		return classe
				+ ", "
				+ getPV()
				+ " PV";
	}

}
