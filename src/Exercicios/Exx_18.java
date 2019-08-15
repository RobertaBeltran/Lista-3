package Exercicios;

import java.util.Scanner;

public class Exx_18 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Informe o número que você deseja: ");
		 int num =entrada.nextInt();
		 int soma=0;
		 
		 for (int i=num;i>0;i--){
			 if(num % i==0){
				 System.out.println("O número é divisivel por "+i);
				 soma=soma+1;
			 }
		 }
		 if(soma>2){
			 System.out.println("Não é primo");
		 }else{
			 for(int i=num;i>0;i--){
				 if(num % i==0){
					 System.out.println("O número é divisivel por "+i);
					 }
			 }
			 System.out.println("É primo"); 
		 }
		 entrada.close();
	}

}
