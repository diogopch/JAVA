package com.Lista03;
/*8. Altere o programa anterior para mostrar no final a soma dos números.*/


import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int i, f, aux, soma=0;
		
		System.out.println("Informe o primeiro numero: ");
		i = entrada.nextInt();
		System.out.println("Informe o segundo numero: ");
		f = entrada.nextInt();
		
		if(i > f) {
			aux=f;
			f=i;
			i=aux;
		}
		
		for( int k=i; k<=f ; k++) {
			System.out.print(k+" + ");
			soma=soma+k;
		}
		
		System.out.println("\nSoma: "+soma);
		
		entrada.close();
		
	}

}
