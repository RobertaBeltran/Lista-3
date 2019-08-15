package Exercicios;

import java.util.Scanner;

public class Ex_2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Informe a senha: ");
		String senha = entrada.nextLine();
		
		while(nome.equalsIgnoreCase(senha)) {
			System.out.println("Sua senha não pode ser igual ao seu nome!");
			System.out.println("Informe uma senha válida: ");
			senha = entrada.nextLine();
		}
		entrada.close();	

	}

}
