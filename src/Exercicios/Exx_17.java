package Exercicios;

import java.util.Scanner;

public class Exx_17 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Informe um n�mero inteiro: ");
		int num = entrada.nextInt();
		
		boolean primo = true;
		float div = 0, met;
		
		if(num>2 && num%2==0) {
			primo = false;
		}else {
			div = 3;
			met = num/2;
			
			while (div<met) {
				if (num%div==0) {
					primo = false;
				}
				div+=2;
			}
		}
		
		if (primo) {
			System.out.println("� primo!");
		}else {
			System.out.println("N�o � primo!");
		}
			
		entrada.close();
	}

}
