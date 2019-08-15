package Exercicios;

import java.util.Scanner;

public class Exx_29 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num, comeca, termina, aux;

		System.out.print("Montar tabuada de: ");
		num = entrada.nextInt();
		
		System.out.print("Começar por: ");
		comeca = entrada.nextInt();
		
		System.out.print("Termina em: ");
		termina = entrada.nextInt();

		if (comeca > termina) {
			aux = comeca;
			comeca = termina;
			termina = aux;
		}
		System.out.println("começa:" + comeca + "termina : " + termina);
		for (int x = comeca; x <= termina; x++) {
			System.out.println(num + " X " + x + " = " + num * x);
		}
		entrada.close();

	}

}
