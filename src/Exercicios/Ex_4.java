package Exercicios;

import java.util.Scanner;

public class Ex_4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		double a = 80000;
		double b = 200000;
		float ano =0;
		
		while (a < b) {
			a = a * 0.03;
			b = b * 0.015;
			ano +=1;			
		}
		
		System.out.println("A popula��o de A se tornar� maior que a popula��o de B em: " + ano + " anos");
		entrada.close();

	}

}
