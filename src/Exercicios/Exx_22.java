package Exercicios;

/*Numa eleição existem três candidatos. 
 * Faça um programa que peça o número total de votantes. 
 * Peça para cada votante votar e ao final mostrar o número de votos de cada candidato. */
import java.util.Scanner;

public class Exx_22 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantos votantes estão presentes: ");
		int n = entrada.nextInt();
		int somaa = 0, somab = 0, somac = 0;
		for (int x = 0; x <= n; x++) {
			System.out.println("Para votar no candidato Cezar, vote: 1");
			System.out.println("Para votar candidato Brusinha,vote: 2");
			System.out.println("Para votar candidato Joãozinho,vote: 3");

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
		+ " votos, O candidato Joãozinho recebeu: " + somac + " votos.");
		
		entrada.close();
	}

}
