package Exercicios;

import java.util.Scanner;

public class Exx_34 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num, cont025 = 0, cont2650 = 0, cont5175 = 0, cont76100 = 0;

		System.out.print("Digite o número:");
		num = entrada.nextInt();

		while (num > 0) {
			if (num <= 25) {
				cont025 = cont025 + 1;
			} else if (num > 25 && num <= 50) {
				cont2650 = cont2650 + 1;
			} else if (num > 50 && num <= 75) {
				cont5175 = cont5175 + 1;
			} else if (num > 75 && num <= 100) {
				cont76100 = cont76100 + 1;
			}
			System.out.print("Digite o número:");
			num = entrada.nextInt();
		}
		System.out.println("Números entre 0 e 25: " + cont025);
		System.out.println("Números entre 25 e 50: " + cont2650);
		System.out.println("Números entre 51 e 75: " + cont5175);
		System.out.println("Números entre 76 e 100: " + cont76100);
		entrada.close();

	}

}
