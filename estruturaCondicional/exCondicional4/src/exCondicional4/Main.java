package exCondicional4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
		//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		
		int inicio, fim, duracao;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a hora de início do jogo: ");
		inicio = sc.nextInt();
		
		System.out.println("Informe a hora do fim do jogo: ");
		fim = sc.nextInt();
		
		if (inicio < fim) {
			duracao = fim - inicio;
			System.out.printf("O jogo teve duração de %d horas", duracao);
		}
		
		else if (inicio > fim) {
			duracao = fim + (24 - inicio);
			System.out.printf("O jogo teve duração de %d horas", duracao);
		}
		
		else {
			System.out.println("O jogo durou 24 horas");
		}
		
		
	}

}
