package Exercicios;

import java.util.Scanner;

public class Exx_19 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o número desejado: ");
		int num = entrada.nextInt();
		int soma = 0;
		int nvezes = num;

		for (int varios = 0; varios <= nvezes; varios++) {
			if (varios <= 1) {
				num = num - 1;
			}
			for (int x = num; x > 0; x--) {
				if (num % x == 0) {
					System.out.println("O número é divisivel por " + x);
					soma = soma + 1;
				}
			}
			if (soma <= 2) {
				for (int x = num; x > 0; x--) {
					if (num % x == 0) {
						System.out.println("O número é divisivel por " + x);
					}
				}
				System.out.println(num + "É primo");
			}
		}
		entrada.close();
	}

}
