/*1. Faça um programa para imprimir:
o 1
o 2 2
o 3 3 3
o .....
o n n n n n n ... n
o
para um n informado pelo usuário. Use uma função que receba um valor n
inteiro e imprima até a n-ésima linha.*/

package com.Lista06;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n;
		
		System.out.print("Informe um valor: ");
		n = entrada.nextInt();
		
		System.out.println(imprimir(n));
		
		entrada.close();

	}
	
	public static String imprimir (int x) {
		StringBuilder saida = new StringBuilder();
		
		for(int i = 0; i < x; i++) {
			for(int j = 0; j <= i; j++) {
				saida.append((i+1));
				saida.append(" ");
			}
			saida.append("\n");
		}

		return saida.toString();
	}

}
