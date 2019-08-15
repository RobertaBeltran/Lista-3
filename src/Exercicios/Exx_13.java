package Exercicios;

import java.util.Scanner;

public class Exx_13 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Informe o número inteiro desejado: ");
		int num=entrada.nextInt();
		
		int aux = num;
		
		if (num ==1) {
			System.out.println("O fatorial de " +num +" é 1.");
			
		}else {
			
			System.out.print(num + "!= ");
			while (aux != 1 ) {
				aux = aux-1;
				num = num*aux;
				System.out.print(aux + "." );
			}
			System.out.println(" = " + num);
		}
		entrada.close();

	}

}
