package Exercicios;

import java.util.Scanner;

public class Exx_26 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Lojas Quase Dois - Tabela de preços");
		for (int x = 0; x <= 50; x++) {
			System.out.println(x + "- R$ " + x * 0.18);
		}
		entrada.close();
	}

}
