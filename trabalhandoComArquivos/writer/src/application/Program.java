package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		//CRIA UM ARQUIVO DE TEXTO newFile.txt NO DIRETÓRIO ESPECIFICADO COM O CONTEÚDO DO VETOR lines
		
		String [] lines = new String[] {"Mr. Mercedes", "Achados e Perdidos", "Último Turno"};
		
		String path = "/home/back-flipe/eclipse-workspace/curso-java/trabalhandoComArquivos/writer/newFile.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
			
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
