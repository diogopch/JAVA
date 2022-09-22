package com.Lista03;
/*7. Faça um programa que receba dois números inteiros e gere os números inteiros que estão
no intervalo compreendido por eles.*/

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int i, f, aux;
		
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
			System.out.print(k+" - ");
		}
		
		
		entrada.close();
		
	}

}
