package Exercicios;

import java.util.Scanner;

public class Exx_30 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int cod, cont, maisalto = 0, maisbaixo = 0, maismagro = 0, maisgordo = 0;
		double peso, altura, maiorpeso = 0, menorpeso = 0, maioraltura = 0, menoraltura = 0, totalpeso = 0,totalaltura = 0;

		System.out.print("Digite o seu c�digo [0]Sair: ");
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

			System.out.println("Digite o seu c�digo [0]Sair:");
			cod = entrada.nextInt();

		}
		System.out.println("O c�digo do cliente mais alto �: " + maisalto + ", com altura de:" + maioraltura);
		System.out.println("O c�digo do cliente mais baixo �: " + maisbaixo + ", com altura de:" + menoraltura);
		System.out.println("O c�digo do cliente mais gordo �: " + maisgordo + ", com peso de:" + maiorpeso);
		System.out.println("O c�digo do cliente mais magro �: " + maismagro + ", com peso de:" + menorpeso);
		System.out.println("A m�dia de altura dos clientes �: " + totalaltura / cont);
		System.out.println("A m�dia de peso dos clientes �: " + totalpeso / cont);
		entrada.close();
	}

}
