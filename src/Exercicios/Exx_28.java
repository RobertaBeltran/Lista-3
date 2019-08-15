package Exercicios;

import java.util.Scanner;

public class Exx_28 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int valida;
		int cont, maior, menor, temp, total;

		System.out.print("Digite a temperatura: ");
		temp = entrada.nextInt();
		
		maior = temp;
		menor = temp;
		cont = 1;
		total = temp;
		
		System.out.println("Deseja acrescentar outra temperatura? [1]Sim [0]Não: ");
		valida = entrada.nextInt();
		
		while (valida == 1) {
			System.out.print("Digite a temperatura: ");
			temp = entrada.nextInt();
			if (temp >= maior) {
				maior = temp;
			} else if (temp < menor) {
				menor = temp;
			}
			total = total + temp;
			cont = cont + 1;
			System.out.println("Deseja acrescentar outra temperatura? [1]Sim [0]NÃ£o");
			valida = entrada.nextInt();

		}
		System.out.println("A maior temperatura digitada foi: " + maior);
		System.out.println("A menor temperatura digitada foi: " + menor);
		System.out.println("A média das temperatura é: " + total / cont);
		entrada.close();
	}

}
