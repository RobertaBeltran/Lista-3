package Exercicios;

import java.util.Scanner;

public class Exx_37 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;
		int cod = 1, nota = 0, cont = 0, notaturma = 0, melhoraluno = 0, pioraluno = 0, maiornota = 0, menornota = 0;

		while (cod != 0) {
			nota = 0;
			cont = cont + 1;
			System.out.print("Resposta da questão 01:");
			q1 = entrada.next();
			System.out.print("Resposta da questão 02:");
			q2 = entrada.next();
			System.out.print("Resposta da questão 03:");
			q3 = entrada.next();
			System.out.print("Resposta da questão 04:");
			q4 = entrada.next();
			System.out.print("Resposta da questão 05:");
			q5 = entrada.next();
			System.out.print("Resposta da questão 06:");
			q6 = entrada.next();
			System.out.print("Resposta da questão 07:");
			q7 = entrada.next();
			System.out.print("Resposta da questão 08:");
			q8 = entrada.next();
			System.out.print("Resposta da questão 09:");
			q9 = entrada.next();
			System.out.print("Resposta da questão 10:");
			q10 = entrada.next();

			if (q1.equalsIgnoreCase("A")) {
				nota = nota + 1;
			}
			if ("B".equals(q2)) {
				nota = nota + 1;
			}
			if ("C".equals(q3)) {
				nota = nota + 1;
			}
			if ("D".equals(q4)) {
				nota = nota + 1;
			}
			if ("E".equals(q5)) {
				nota = nota + 1;
			}
			if ("E".equals(q6)) {
				nota = nota + 1;
			}
			if ("D".equals(q7)) {
				nota = nota + 1;
			}
			if ("C".equals(q8)) {
				nota = nota + 1;
			}
			if ("B".equals(q9)) {
				nota = nota + 1;
			}
			if ("A".equals(q10)) {
				nota = nota + 1;
			}
			notaturma = notaturma + nota;

			if (cont == 1) {
				maiornota = nota;
				menornota = nota;
				melhoraluno = cod;
				pioraluno = cod;

			} else {
				if (nota > maiornota) {
					maiornota = nota;
					melhoraluno = cod;
				} else if (nota < menornota) {
					menornota = nota;
					pioraluno = cod;
				}
			}

			System.out.println("Nota da prova: " + nota);
			System.out.println("Outro aluno vai utilizar o sistema?    [0]Não");
			cod = entrada.nextInt();

		}
		System.out.println("Código do aluno com mais acertos: " + melhoraluno);
		System.out.println("Código do aluno com menos acertos: " + pioraluno);
		System.out.println("Número de alunos que utilizaram o sistema: " + cont);
		System.out.println("Média de notas da turma: " + notaturma / cont);
		entrada.close();
	}

}
