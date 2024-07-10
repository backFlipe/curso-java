package application;

import entities.Account;
import entities.BussinessAccount;
import entities.SavingsAccount;

public class Programm {

	public static void main(String[] args) {
		
		Account acc = new Account(666, "Felipe", 3000.0);
		
		BussinessAccount bacc = new BussinessAccount(777, "ozzy", 6500.0, 500.0);

		//UPCASTING	É O CASTING DA SUBCLASSE PARA SUPERCLASSE (USADO EM POLIMORFISMO)
		
		Account acc1 = bacc;
		Account acc2 = new BussinessAccount(888, "Filpo", 5000.45, 780.0);
		Account acc3 = new SavingsAccount(999, "tigas", 8000.00, 0.1);
		
		//DOWNCASTING É O CASTING DA SUPERCLASSE PARA A SUBCLASSE (instanceof)
		
		BussinessAccount acc4 = (BussinessAccount)acc2;
		acc4.loan(250.00);
		
		//"BusinessAccount acc5 = (BusinessAccount)acc3;" 
		//NÃO É POSSÍVEL POIS A SUBCLASSE BussinessAccount NÃO SE RELACIONA COM A SUBCLASSE SavingsAccount
		
		if (acc3 instanceof BussinessAccount) {
			BussinessAccount acc5 = (BussinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("LOAN");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("BALANCE");
		}
		
		//POLIMORFISMO PERMITE QUE VARIÁVEIS DE TIPO GENÉRICO APONTEM PARA OBJETOS DE TIPOS ESPECÍFICOS
		
		Account x = new Account(161, "Legal", 100.00);
		Account y = new SavingsAccount(456, "Piolho", 100.00, 0.01);
		
		x.withDraw(10.00);
		y.withDraw(10.00);
		
		System.out.println("x = " + x.getBalance());
		System.out.println("y = " + y.getBalance());
	}

}
