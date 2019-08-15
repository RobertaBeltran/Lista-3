package Exercicios;

import java.util.Scanner;

public class Ex_1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe uma nota entre 0 à 10: ");
		float nota = entrada.nextFloat();
		
		while(nota<0||nota>10) {
			System.out.println("Nota inválida!!");
			System.out.println("Informe uma nota entre 0 à 10: ");
			nota=entrada.nextFloat();
		}
		System.out.print("Sua nota é: " + nota);	
		entrada.close();

	}

}
