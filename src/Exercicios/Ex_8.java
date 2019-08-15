package Exercicios;

import java.util.Scanner;

public class Ex_8 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);	
		
		int i=0;
		int soma = 0;
		
		System.out.print("Informe um número inteiro: ");
		int num1=entrada.nextInt();
		
		System.out.print("Informe um número inteiro: ");
		int num2=entrada.nextInt();
		
		if (num1>num2) {
			for (i=(num2+1);i<num1;i++) {
				System.out.print(i + " ");
				soma += i;
				
			}
		}else if (num2>num1) {
			for (i=(num1+1);i<num2;i++) {
				System.out.print(i + " ");	
				soma += i;
			}
		}
		
		System.out.println("O resultado da soma do intervalo entre" + num1 + " e " + num2 + " é: " + soma);
		
		entrada.close();

	}

}
