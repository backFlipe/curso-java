package teste;

import java.util.Locale;

public class Teste {

	public static void main(String[] args) {
		
		int x = 66;
		double y = 10.456754;
		String nome = "pessoa";
		int idade = 42;
		double renda = 150000.132;
		
		System.out.println("Hello World!");
		
		System.out.println(x);
		
		System.out.println(y);
		
		//FORMATAÇÃO DE VALORES TIPO DOUBLE
		
		System.out.printf("%.2f%n", y);
		
		System.out.printf("%.4f\n", y);
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f\n", y);
		
		//CONCATENAÇÃO
		
		System.out.println("Resultado = " + y + " metros.");
			
		//CONCATENAÇÃO COM PRINTF
		
		System.out.printf("Resultado = %.2f metros\n", y);
		
		//CONCATENAÇÃO DE VÁRIAS VARIÁVEIS
		
		System.out.printf("A funcincionária %s tem %d anos e recebe %.2f reais\n", nome, idade, renda);
		
		
	}

}
//Comentário para testar chave ssh
//Outro teste

