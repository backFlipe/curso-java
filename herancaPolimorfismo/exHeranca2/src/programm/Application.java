package programm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Application {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner (System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List <Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.printf("Enter product #%d data: \n", i);
			System.out.print("Common, used or imported? (c/u/i) ");
			char resp = sc.next().charAt(0);
			
			if (resp == 'c') {
				System.out.print("Name: ");
				String name =sc.next();
				System.out.print("Price: ");
				double price = sc.nextDouble();
				
				list.add(new Product(name, price));
			}
			else if (resp == 'u') {
				System.out.print("Name: ");
				String name =sc.next();
				System.out.print("Price: ");
				double price = sc.nextDouble();
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				
				list.add(new UsedProduct(name, price, date));
			}
			else {
				System.out.print("Name: ");
				String name =sc.next();
				System.out.print("Price: ");
				double price = sc.nextDouble();
				System.out.print("Customs fee: ");
				double fee = sc.nextDouble();
				
				list.add(new ImportedProduct(name, price, fee));
			}
		}
		
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();
	}

}
