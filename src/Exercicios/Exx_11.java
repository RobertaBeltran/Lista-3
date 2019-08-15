package Exercicios;

import java.util.Scanner;

public class Exx_11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);	
		
		int x=10, i, num, par = 0, impar = 0;
		int vetor[] = new int[x];
				
			for (i=0; i<x; i++) {
				System.out.print("Digite um número: ");
				vetor [i] = num = entrada.nextInt();
				
				if (num%2==0) {
					par = par +1;					
				}else {
					impar=impar+1;
				}
			}
			System.out.println("Você digitou " + par + " números pares e " + impar + " número ímpares.");
		
				
		entrada.close();

	}

}
