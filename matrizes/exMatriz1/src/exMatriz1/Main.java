package exMatriz1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Insira o número de linhas e colunas: ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int [][] mat = new int [n][m];
		
		System.out.println("Digite a matriz: ");
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
				
			}
			
		}
		
		System.out.println("Informe um valor da matriz: ");
		int x = sc.nextInt();
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (x == mat[i][j]) {
					System.out.println("Posição: " + i + ", " + j);
					if (i > 0) {
					System.out.println("Up: " + mat[i -1][j]);
					}
					if (i < mat.length-1) {
					System.out.println("Down: " + mat[i + 1][j]);
					}
					if (j > 0) {
					System.out.println("Left: " + mat[i][j - 1]);
					}
					if (j < mat[i].length-1) {
					System.out.println("Right: " + mat[i][j + 1]);
					}
					
				}
				
			}
			
		}
		
		sc.close();
	}

}
