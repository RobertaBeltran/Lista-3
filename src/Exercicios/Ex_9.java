package Exercicios;

import java.util.Scanner;

public class Ex_9 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);	
		int i=0;
		
		System.out.print("Informe o número que você deseja ver a tabuada: ");
		int num = entrada.nextInt();
		System.out.println("Tabuada de " + num + ": ");
		for (i=0;i<=10;i++) {
			int tab = num*i;
			System.out.println(num + " x " + i +" = " + tab);
		}
		entrada.close();

	}

}
