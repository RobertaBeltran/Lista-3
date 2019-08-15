package Exercicios;

import java.util.Scanner;

public class Exx_31 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int altura, maioraltura = 0, menoraltura = 0, cod, maisalto = 0, maisbaixo = 0;

		for (int x = 1; x <= 10; x++) {
			System.out.print("Digite o número do aluno: ");
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
		System.out.println("O número do aluno mais alto é: " + maisalto + " com altura de: " + maioraltura + "centímetros!");
		System.out.println("O número do aluno mais baixo é: " + maisbaixo + " com altura de: " + menoraltura + "centímetros!");
		entrada.close();
	}

}
