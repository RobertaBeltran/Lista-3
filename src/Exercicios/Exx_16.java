package Exercicios;

import java.util.Scanner;

public class Exx_16 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		float valor=0, soma=0;
		
		System.out.print("Informe a quantidade de n�meros que voc� deseja digitar: ");
		float n=entrada.nextFloat();
		
		if (n==0){
			while(n==0) {
				System.out.print("Voc� digitou " + n + " informe a quantidade de n�meros que voc� deseja: ");
				n=entrada.nextFloat();
			}
		}else {
			for (int i=1; i<=n;i++) {
				System.out.print("Informe o n�mero desejado: ");
				valor = entrada.nextFloat();
				soma = soma + valor;
				
			}
			
			System.out.println("A soma dos valores informados = " + soma);
		}
		entrada.close();
	}

}
