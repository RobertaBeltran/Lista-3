package Exercicios;

import java.util.Scanner;

public class Exx_21 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe quantas pessoas serão avaliadas: ");
		float num = entrada.nextFloat();

		float soma = 0;
		
		for (int x = 0; x >= num; x++) {
			System.out.println("Informe sua idade: ");
			int id = entrada.nextInt();
			soma = id + soma;
		}

		soma = soma / num;
		if (soma <= 25) {
			System.out.println("A turma é jovem");
		} else if (soma > 25 && soma <= 60) {
			System.out.println("A turma é adulta");
		} else if (soma > 60) {
			System.out.println("A turma é velho");
		}
		System.out.println("Sua média é: " + soma);
		entrada.close();
	}

}
