package Exercicios;

import java.util.Scanner;

public class Exx_35 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		int cod, quant;
		double preco = 0, precototal = 0;

		System.out.print("Qual o seu pedido?");
		cod = entrada.nextInt();

		while (cod != 0) {
			System.out.print("Quantidade:");
			quant = entrada.nextInt();
			if (cod == 100) {
				preco = 1.20;
				System.out.println("Cachorro Quente: R$" + preco + "/uni.");
				preco = preco * quant;
			} else if (cod == 101) {
				preco = 1.30;
				System.out.println("Bauru Simples: R$" + preco + "/uni.");
				preco = preco * quant;
			} else if (cod == 102) {
				preco = 1.50;
				System.out.println("Bauru com ovo: R$" + preco + "/uni.");
				preco = preco * quant;
			} else if (cod == 103) {
				preco = 1.20;
				System.out.println("Hambúrguer: R$" + preco + "/uni.");
				preco = preco * quant;
			} else if (cod == 104) {
				preco = 1.30;
				System.out.println("Cheeseburguer: R$" + preco + "/uni.");
				preco = preco * quant;
			} else if (cod == 105) {
				preco = 1.00;
				System.out.println("Refrigerante: R$" + preco + "/uni.");
				preco = preco * quant;
			}
			precototal = precototal + preco;
			System.out.print("Mais alguma coisa?");
			cod = entrada.nextInt();

		}
		System.out.println("Valor total do pedido: R$" + precototal);
		entrada.close();
	}

}
