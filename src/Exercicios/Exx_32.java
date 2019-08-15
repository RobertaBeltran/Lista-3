package Exercicios;

import java.util.Scanner;

public class Exx_32 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int cidade, veiculos, acidentes, totalacidentes = 0, totalveiculos = 0;
		double menorindice = 0, maiorindice = 0, cidademenor = 0, cidademaior = 0, soma2000 = 0, cont2000 = 0,
				mediaacidentes;

		for (int x = 1; x <= 5; x++) {
			System.out.print("Digite o codigo da cidade: ");
			cidade = entrada.nextInt();
			
			System.out.print("Digite o número de veículos de passeio que a cidade possui: ");
			veiculos = entrada.nextInt();
			
			totalveiculos = totalveiculos + veiculos;
			System.out.print("Digite o número de acidentes com vítimas nesta cidade: ");
			acidentes = entrada.nextInt();
			
			totalacidentes = totalacidentes + acidentes;
			mediaacidentes = acidentes / veiculos;
			
			if (x == 1) {
				menorindice = mediaacidentes;
				cidademenor = cidade;
				maiorindice = mediaacidentes;
				cidademaior = cidade;
			} else {
				if (maiorindice > mediaacidentes) {
					maiorindice = mediaacidentes;
					cidademaior = cidade;
				} else if (menorindice < mediaacidentes) {
					menorindice = mediaacidentes;
					cidademenor = cidade;
				}
			}
			if (veiculos < 2000) {
				soma2000 = soma2000 + 1;
				cont2000 = cont2000 + 1;
			}
		}
		System.out.println("Maior índice de acidentes de trânsito: " + maiorindice + "  na cidade :" + cidademaior);
		System.out.println("Menor índice de acidentes de trânsito: " + menorindice + "  na cidade :" + cidademenor);
		System.out.println("Média de veículos nas cinco cidades juntas: " + totalveiculos / 5);
		System.out.println("Média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio: "
				+ soma2000 / cont2000);
		entrada.close();
	}

}
