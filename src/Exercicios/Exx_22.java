package Exercicios;

/*Numa elei��o existem tr�s candidatos. 
 * Fa�a um programa que pe�a o n�mero total de votantes. 
 * Pe�a para cada votante votar e ao final mostrar o n�mero de votos de cada candidato. */
import java.util.Scanner;

public class Exx_22 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantos votantes est�o presentes: ");
		int n = entrada.nextInt();
		int somaa = 0, somab = 0, somac = 0;
		for (int x = 0; x <= n; x++) {
			System.out.println("Para votar no candidato Cezar, vote: 1");
			System.out.println("Para votar candidato Brusinha,vote: 2");
			System.out.println("Para votar candidato Jo�ozinho,vote: 3");

			int vot = entrada.nextInt();
			if (vot == 1) {
				somaa = somaa + 1;
			} else if (vot == 2) {
				somab = somab + 1;
			} else if (vot == 3) {
				somac = somac + 1;
			}
		}
		System.out.println("O candidato Cezar recebeu:" + somaa + "votos,O candidato Bruzinha recebeu: " + somab
		+ " votos, O candidato Jo�ozinho recebeu: " + somac + " votos.");
		
		entrada.close();
	}

}
