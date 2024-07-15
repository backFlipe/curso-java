package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		//try-with-resources É UM BLOCO try QUE DECLARA UM OU MAIS RECURSOS E GARANTE QUE SEJAM FECHADOS AO FINAL DO BLOCO	
		
		String path = "/home/back-flipe/eclipse-workspace/curso-java/loremIpsum";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
