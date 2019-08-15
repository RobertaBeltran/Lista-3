package Exercicios;

import java.util.Scanner;

public class Exx_12 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println( "A s�rie Fibonacci � formada pela sequ�ncia 1,1,2,3,5,8,13,21,34,55...");
		System.out.print("Qual a posica��o do termo que voc� deseja encontrar: ");
		int num = entrada.nextInt();
		
		int ultimo=1, penultimo=1, termo = 0;
		
		if (num==1||num==2) {
			System.out.println("O termo �: 1");
		}else {
			int cont =3;
		
			while (cont<num) {
				termo = ultimo + penultimo;
				penultimo = ultimo;
				ultimo = termo;
				cont += 1;
			}
			
			System.out.println("O termo �: " + termo);
		}
		entrada.close();

	}

}
