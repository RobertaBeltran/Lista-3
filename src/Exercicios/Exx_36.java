package Exercicios;

import java.util.Scanner;

public class Exx_36 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int cand1 = 0, cand2 = 0, cand3 = 0, cand4 = 0, votn = 0, votb = 0, cod, x, totalvotos = 0;
		double percentagemnulos = 0, percentagembrancos = 0;

		System.out.println("         1=candidato A        ");
		System.out.println("         2=candidato B        ");
		System.out.println("         3=candidato C        ");
		System.out.println("         4=candidato D        ");
		System.out.println("         5=voto nulo          ");
		System.out.println("         6=voto branco        ");

		System.out.println(" Voc� deseja votar? [1]SIM [0]N�O");
		cod = entrada.nextInt();

		while (cod == 1) {
			totalvotos = totalvotos + 1;
			System.out.print("Qual o seu voto: ");
			x = entrada.nextInt();
			if (x == 1) {
				cand1 = cand1 + 1;
			} else if (x == 2) {
				cand2 = cand2 + 1;
			} else if (x == 3) {
				cand3 = cand3 + 1;
			} else if (x == 4) {
				cand4 = cand4 + 1;
			} else if (x == 5) {
				votn = votn + 1;
			} else if (x == 6) {
				votb = votb + 1;
			}
			System.out.println("Voce deseja votar novamente?  [1]SIM [0]NÃO");
			cod = entrada.nextInt();
		}
		System.out.println("o total de votos do 1� candidato �:" + cand1);
		System.out.println("o total de votos do 2� candidato �:" + cand2);
		System.out.println("o total de votos do 3� candidato �:" + cand3);
		System.out.println("o total de votos do 4� candidato �:" + cand4);
		System.out.println("o total de votos nulos �:" + votn);
		System.out.println("o total de votos brancos �:" + votb);
		percentagemnulos = votn / totalvotos;
		System.out.println((percentagemnulos * 100) + "% dos votos s�o nulos!");
		percentagembrancos = (votb / totalvotos);
		System.out.println((percentagembrancos * 100) + "% dos votos s�o brancos");
		entrada.close();

	}

}
