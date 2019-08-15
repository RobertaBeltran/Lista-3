package Exercicios;

import java.util.Scanner;

public class Exx_27 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		System.out.println("Lojas Tabajara");
		int x = 0;
		int soma = 0;
		while (true) {
			while (true) {
				x = x + 1;
				System.out.println("Qual o preço: ");
				int preco = entrada.nextInt();
				if (preco == 0) {
					break;
				}
				System.out.println("Quantos produtos: ");
				int quant = entrada.nextInt();
				soma = quant * preco + soma;
				System.out.println(x + "-" + quant + "- R$ " + quant * preco);

			}
			System.out.println(" Total R$ " + soma);
			System.out.println("Quanto vai pagar: ");
			int troco = entrada.nextInt();
			troco = troco - soma;
			System.out.println("Seu troco é de: " + troco);
		}
	}

}
