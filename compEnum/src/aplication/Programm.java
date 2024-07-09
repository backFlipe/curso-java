package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import aplication.enums.OrderStatus;
import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;

public class Programm {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner (System.in);
		
		List <OrderItem> list = new ArrayList<>();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date bDay = sdf.parse(sc.next());
		
		Client clt = new Client(name, email, bDay);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order ord = new Order(new Date(), status, clt);
		
		System.out.print("How many items in this order? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.printf("Enter #%d item data: \n", i);
			System.out.print("Product name: ");
			String pName = sc.next();
			System.out.print("Product price: ");
			double prodPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int pQuantity = sc.nextInt();

			Product prod = new Product(pName, prodPrice);	
			
			OrderItem it = new OrderItem(pQuantity, prodPrice, prod);
			
			ord.addItem(it);
		}
		
		System.out.println(ord);
		
		sc.close();
		
	}

}
