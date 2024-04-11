import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("O número digitado é PAR!");
		}
		
		else {
			System.out.println("O número digitado é ÍMPAR!");
		}

	}

}
