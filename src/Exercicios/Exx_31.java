package Exercicios;

import java.util.Scanner;

public class Exx_31 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int altura, maioraltura = 0, menoraltura = 0, cod, maisalto = 0, maisbaixo = 0;

		for (int x = 1; x <= 10; x++) {
			System.out.print("Digite o n�mero do aluno: ");
			cod = entrada.nextInt();
			System.out.print("Digite a altura do aluno(em cm): ");
			altura = entrada.nextInt();

			if (x == 1) {
				maisalto = cod;
				maisbaixo = cod;
				maioraltura = altura;
				menoraltura = altura;
			}
			if (altura > maioraltura) {
				maisalto = cod;
				maioraltura = altura;
			} else if (altura < menoraltura) {
				maisbaixo = cod;
				menoraltura = altura;
			}
		}
		System.out.println("O n�mero do aluno mais alto �: " + maisalto + " com altura de: " + maioraltura + "cent�metros!");
		System.out.println("O n�mero do aluno mais baixo �: " + maisbaixo + " com altura de: " + menoraltura + "cent�metros!");
		entrada.close();
	}

}
