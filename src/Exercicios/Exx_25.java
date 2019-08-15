package Exercicios;

import java.util.Scanner;

public class Exx_25 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		for (int x = 0; x <= 50; x++) {
			System.out.println("Lojas Quase Dois - Tabela de preços");
			System.out.println(x + "- R$ " + x * 1.99);
		}
		entrada.close();
	}

}
