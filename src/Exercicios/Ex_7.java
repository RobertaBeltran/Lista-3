package Exercicios;

import java.util.Scanner;

public class Ex_7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);	
		
		int i=0;
		
		System.out.print("Informe um número inteiro: ");
		int num1=entrada.nextInt();
		
		System.out.print("Informe um número inteiro: ");
		int num2=entrada.nextInt();
		
		if (num1>num2) {
			for (i=(num2+1);i<num1;i++) {
				System.out.print(i + " ");				
			}
		}else if (num2>num1) {
			for (i=(num1+1);i<num2;i++) {
				System.out.print(i + " ");				
			}
		}
		
		entrada.close();

	}

}
