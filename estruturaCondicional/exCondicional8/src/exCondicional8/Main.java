package exCondicional8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
		//que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
		//qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
		//Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
		//mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
		
		double salario, imposto;
		
		Scanner sc;
		sc = new Scanner(System.in);
		
		System.out.print("Informe seu salário: R$");
		salario = sc.nextDouble();
		
		if (salario > 0.00 && salario <= 2000.00) {
			System.out.println("Isento de imposto de renda");
			
		}
		
		else if (salario > 2000.00 && salario <= 3000.00) {
			imposto = (salario - 2000) * 8/100;
			System.out.printf("O valor a se pagar é de R$%.2f", imposto);
			
		}
		
		else if (salario > 3000 && salario <= 4500) {
			imposto = (1000 * 8/100) + ((salario - 3000) * 18/100);
			System.out.printf("O valor do imposto é de R$%.2f", imposto);
			
		}
		
		else if (salario > 4500) {
			imposto = (1000 * 8/100) + (1500 * 18/100) + ((salario - 4500) * 28/100);
			System.out.printf("O valor do imposto é de R$%.2f", imposto);
		}
		
		else {
			System.out.println("VALOR INVÁLIDO!");
		}
		
		
		sc.close();
		
	}

}
