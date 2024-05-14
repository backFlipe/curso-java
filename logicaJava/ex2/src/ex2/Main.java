package ex2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * 2) Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de
		 * boasvindas para ela: Ex: Qual é o seu nome? João da Silva Olá João da Silva,
		 * é um prazer te conhecer!
		 */
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Qual é o seu nome? ");
		String nome = sc.nextLine();
		
		System.out.println("Olá " + nome);

	}

}
