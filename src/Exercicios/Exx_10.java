package Exercicios;

import java.util.Scanner;

public class Exx_10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);	
		
		float result =1;
		System.out.print("Informe o número da base: ");
		float base= entrada.nextFloat();
		
		System.out.print("Informe o númedo do expoente: ");
		float expoente = entrada.nextFloat();
		
		while (expoente != 0) {
			result = result * base;
			expoente --;		
		}
		System.out.println("O resultado da potencia: " + result);
		entrada.close();
	}

}
