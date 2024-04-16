package exWhile3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
		//um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
		//4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
		//que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
		//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
		//exemplo.
		
		int codigo, quantAlc, quantGas, quantDies;
		quantAlc = 0;
		quantGas = 0;
		quantDies = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe o tipo de combustível: ");
		System.out.println("[1] Álcool;");
		System.out.println("[2] Gasolina;");
		System.out.println("[3] Diesel;");
		System.out.println("[4] Encerrar Programa.");
		codigo = sc.nextInt();
		
		while (codigo != 4) {
			codigo = sc.nextInt();
			
			switch (codigo) {
			case 1:
				quantAlc += 1;
			break;
			
			case 2:
				quantGas += 1;
			break;
			
			case 3:
				quantDies += 1;
			break;
			
			case 4: 
				System.out.println("MUITO OBRIGADO!");
			break;
			
			default: 
				System.out.println("Código Inválido");
			break;
			
			}
			
		}
		
		System.out.println("Álcool: " + quantAlc);
		System.out.println("Gasolina: " + quantGas);
		System.out.println("Diesel: " + quantDies);
		
		sc.close();

	}

}
