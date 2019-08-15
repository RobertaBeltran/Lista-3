package Exercicios;

import java.util.Scanner;

public class Exx_24 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe quantos CDs tem: ");
		int n = entrada.nextInt();
		int soma = 0;
		for (int x = 0; x <= n; x++) {
			System.out.println("Qual o valor dos Cds: ");
			int num = entrada.nextInt();

			soma = num + soma;
		}

		System.out.println("O valor investido foi: " + soma);
		soma = soma / n;
		System.out.println("Valor médio de gasto de Cds:" + soma);
		entrada.close();
	}

}
