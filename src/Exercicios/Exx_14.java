package Exercicios;

import java.util.Scanner;

// Mostre e calcule a série S = (37*38)/1 + (36*37)/2 + (35*36)/3 + ... + (1*2)/37.

public class Exx_14 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Informe a quantidade de termos da série: ");	
		int num = entrada.nextInt();
		
		System.out.print("1/1 + ");	
		
		for ( int k =1; k<=num;k++){
			System.out.print(k+1+"/"+(k*2+1)+" + " );
		}
		entrada.close();
	}

}
