package Exercicios;

import java.util.Scanner;

public class Ex_3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		String nome, sexo, estadoC;
		int idade, cont =0;
		float salario;
		boolean condi = true;
		
		System.out.println("Informe nome: ");
		nome=entrada.nextLine();
		
		System.out.println("Informe o sexo: (F - Feminino/ M - Masculino");
		sexo=entrada.nextLine();
		
		System.out.println("Informe idade: ");
		idade=entrada.nextInt();
		
		System.out.println("Informe sal�rio maior que R$ 0,00: ");
		salario=entrada.nextFloat();
		
		
		System.out.println("Informe estado civil: (S - Solteiro/ C - Casado/ D - Divorciado/ V - Vi�vo )");
		entrada.next();
		estadoC=entrada.nextLine();
		
		while (condi) {
			
			while (nome.length()<4) {
				System.out.println("O nome que voc� digitou � inv�lido!");
				System.out.println("Informe nome: ");
				nome = entrada.nextLine();	
				cont=cont++;
			} while (idade<0||idade>150) {
				System.out.println("A idade que voc� digitou � inv�lida!");
				System.out.println("Informe idade: ");
				idade=entrada.nextInt();
			
			} while ((!"f".equalsIgnoreCase(sexo))&&(!"m".equalsIgnoreCase(sexo))) {
				System.out.println("O sexo que voc� digitou � inv�lido!");
				System.out.println("Informe o sexo: (F - Feminino/ M - Masculino");
				sexo=entrada.nextLine();
				
			} while(salario<0) {
				System.out.println("O valor de sal�rio informado � inv�lido!");
				System.out.println("Informe sal�rio maior que R$ 0,00: ");
				salario=entrada.nextFloat();
				
				
			} 
			while ( !"s".equalsIgnoreCase(estadoC) && !"d".equalsIgnoreCase(estadoC)&& !"v".equalsIgnoreCase(estadoC)&& !"c".equalsIgnoreCase(estadoC)){
				
				System.out.println("O estado civil que voc� digitou � inv�lido!");
				System.out.println("Informe estado civil: (S - Solteiro/ C - Casado/ D - Divorciado/ V - Vi�vo )");
				estadoC=entrada.nextLine();
				
			}
				condi=false;
				
			}
		System.out.println("Nome: " + nome + " Idade: "+ idade + " Sexo: " + sexo + " Sal�rio: "+ salario + " Estado civil: " + estadoC);
		entrada.close();
	}

}
