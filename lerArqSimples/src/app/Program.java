package app;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main (String [] args) {
		
		File file = new File("/home/back-flipe/eclipse-workspace/curso-java/teste");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		
		finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
