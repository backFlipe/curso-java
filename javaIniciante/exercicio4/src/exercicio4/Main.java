package exercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
		//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
		//decimais.
		
		int codigo;
		double horas, valorPorHora, salario;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu código: ");
			codigo = sc.nextInt();
			
		System.out.println("Informe a quantidade de horas trabalhadas: ");
			horas = sc.nextDouble();
		
		System.out.println("Informe quanto recebe por hora: ");
			valorPorHora = sc.nextDouble();
			
		salario = horas * valorPorHora;
		
		System.out.printf("NÚMERO = %d\n", codigo);
		System.out.printf("SALÁRIO = R$%.2f\n", salario);
		
		sc.close();
		

	}

}
