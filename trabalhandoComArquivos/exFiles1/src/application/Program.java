package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler o caminho de um arquivo .csv contendo os dados de
		 * itens vendidos. Cada item possui um nome, preço unitário e quantidade,
		 * separados por vírgula. Você deve gerar um novo arquivo chamado "summary.csv",
		 * localizado em uma subpasta chamada "out" a partir da pasta original do
		 * arquivo de origem, contendo apenas o nome e o valor total para aquele item
		 * (preço unitário multiplicado pela quantidade), conforme exemplo
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the path of the file: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		
		Product pd = new Product();
		List <Product> prod = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(strPath))){
			
			String line = br.readLine();
			String [] splitText = line.split(",");
			
			while (line != null) {
				splitText = line.split(",");
				System.out.println(Arrays.toString(splitText));
				pd = new Product(splitText[0], Double.parseDouble(splitText[1]), Integer.parseInt(splitText[2]));
				prod.add(pd);
				
				line = br.readLine();
		
			}
			
			
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		boolean newDir = new File((String)(path.getParent()) + "/out").mkdir();
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path.getParent() + "/out/summary.csv"))){
			for(Product p : prod) {
				bw.write(p.toString());
				bw.newLine();
			}
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
		sc.close();
	}

}
