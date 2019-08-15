package Exercicios;

import java.util.Scanner;

public class Exx_30 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int cod, cont, maisalto = 0, maisbaixo = 0, maismagro = 0, maisgordo = 0;
		double peso, altura, maiorpeso = 0, menorpeso = 0, maioraltura = 0, menoraltura = 0, totalpeso = 0,totalaltura = 0;

		System.out.print("Digite o seu código [0]Sair: ");
		cod = entrada.nextInt();
		cont = 0;

		while (cod != 0) {
			System.out.print("Digite sua altura(cm): ");
			altura = entrada.nextDouble();
			
			System.out.print("Digite seu peso(kg): ");
			peso = entrada.nextDouble();
			
			totalpeso = totalpeso + peso;
			totalaltura = totalaltura + altura;
			cont = cont + 1;
			
			if (cont == 1) {
				maisalto = cod;
				maismagro = cod;
				maisgordo = cod;
				maiorpeso = peso;
				menorpeso = peso;
				maioraltura = altura;
				menoraltura = altura;

			} else {
				if (altura > maioraltura) {
					maisalto = cod;
					maioraltura = altura;
				} else if (altura < menoraltura) {
					maisbaixo = cod;
					menoraltura = altura;
				}
				if (peso > maiorpeso) {
					maisgordo = cod;
					maiorpeso = peso;
				} else if (peso < menorpeso) {
					maismagro = cod;
					menorpeso = peso;
				}
			}

			System.out.println("Digite o seu código [0]Sair:");
			cod = entrada.nextInt();

		}
		System.out.println("O código do cliente mais alto é: " + maisalto + ", com altura de:" + maioraltura);
		System.out.println("O código do cliente mais baixo é: " + maisbaixo + ", com altura de:" + menoraltura);
		System.out.println("O código do cliente mais gordo é: " + maisgordo + ", com peso de:" + maiorpeso);
		System.out.println("O código do cliente mais magro é: " + maismagro + ", com peso de:" + menorpeso);
		System.out.println("A média de altura dos clientes é: " + totalaltura / cont);
		System.out.println("A média de peso dos clientes é: " + totalpeso / cont);
		entrada.close();
	}

}
