package com.Lista02;
/*25. Faça um Programa que peça um número inteiro e determine se ele é par ou impar. Dica:
utilize o operador módulo (resto da divisão).*/

import java.util.Scanner;

public class Ex25e {

	public static void main(String[] args) {
		int n;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe numero:");
		n = entrada.nextInt();
		if((n%2)==0) {
			System.out.println("É PAR");
		}else {
			System.out.println("É IMPAR.");
		}
		
		
		entrada.close();
	
	}
}