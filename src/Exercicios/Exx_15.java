package Exercicios;

public class Exx_15 {

	public static void main(String[] args) {
		
		int n1=37, n2, i=1;
		float soma = 0;
	
		System.out.println("A série S = (37*38)/1 + (36*37)/2 + (35*36)/3 + ... + (1*2)/37. ");
		
		for (n2=1; n2<=37; n2++) {
			int a=n1+1;
			soma += (n1*(n1+i))/n2;
			System.out.print(" A série "+ n1 +" * " +a +"/"+n2 + " + ");
			n1 --;
			
		}
		System.out.println();
		System.out.println("A soma dos numeros: " + soma);
	}

}
