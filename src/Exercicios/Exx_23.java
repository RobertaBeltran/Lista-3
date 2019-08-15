package Exercicios;

import java.util.Scanner;

public class Exx_23 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe quantas turmas tem: ");
		int n = entrada.nextInt();
		int soma = 0;

		for (int x = 0; x <= n; x++) {
			System.out.println("Informe quantos alunos tem: ");
			int num = entrada.nextInt();

			if (num > 40) {
				System.out.println("As turmas não podem ter mais que 40 alunos, repita.");
				x = x - 1;
			} else if (num <= 40) {
				soma = num + soma;
			}
			soma = soma / n;
		}
		System.out.println("Número médio de alunos em sala:" + soma);
		entrada.close();

	}

}
