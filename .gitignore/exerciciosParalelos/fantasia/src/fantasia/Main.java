package fantasia;

import java.util.Scanner;
import entities.Classes;

public class Main {

	public static void main(String[] args) {
		/*

		01 - Jogo de fantasia

		Você é responsável pelo sistema de um novo jogo de fantasia medieval.

		Escreva um algoritmo que recebe o nome da classe e retorne os pontos de vida do(a) personagem, com base na tabela a seguir:

		|   Classe     |   Pontos de Vida   |

		|    Mago      |        5PV         |
		|   Arqueiro   |        10PV        |
		|   Guerreiro  |        15PV        |
		|   Cavaleiro  |        20PV        |

		Por exemplo:
		------------
		Entrada:
		"Mago"'

		Saída:
		"Mago, 5PV"
		------------

		Desafio: faça sem usar estruturas condicionais (ifs ou switches) 

		*/
		
		Scanner sc = new Scanner (System.in);
		
		Classes cl = new Classes();
		
		System.out.print("Informe o nome da classe: ");
		cl.setClasse(sc.nextLine());
		
		System.out.println(cl.toString());

	}

}
