package Exercicios;

import java.util.Scanner;

public class Ex_4alterado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);		
		
		double a = 0;
		double b = 0;
		float ano =0;
		
		System.out.println("Digite um valor para a população A: ");
		a = entrada.nextDouble();
		
		System.out.println("Digite um valor para a população B: ");
		b = entrada.nextDouble();
		
		while (a < b) {
			a = a * 0.03;
			b = b * 0.015;
			ano +=1;			
		}
		
		System.out.println("A população de A se tornará maior que a população de B em: " + ano + " anos");
		entrada.close();

	}

}
