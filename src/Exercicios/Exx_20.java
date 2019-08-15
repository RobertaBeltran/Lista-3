package Exercicios;

import java.util.Scanner;

public class Exx_20 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantas notas você vai informar: ");
		float num = entrada.nextFloat();

		float soma = 0;

		for (int x = 0; x >= num; x++) {
			System.out.println("Qual sua nota: ");
			int nota = entrada.nextInt();
			soma = nota + soma;

		}
		soma = soma / num;
		System.out.println("Sua média é: " + soma);
		entrada.close();
	}

}
