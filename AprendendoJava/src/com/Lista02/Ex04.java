package com.Lista02;
/*4. Faça um Programa que peça para entrar com um ano com 4 dígitos e determine se o
mesmo é ou não bissexto.*/

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		int ano;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o ano - aaaa: ");
		ano = entrada.nextInt();
		if((ano%4)==0) {
			System.out.println("O ano é Bissexto.");
		}else {
			System.out.println("O ano não é bissexto.");
		}
		
		entrada.close();

	}

}
