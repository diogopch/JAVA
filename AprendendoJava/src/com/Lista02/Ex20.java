package com.Lista02;
/*20. Faça um Programa que peça um número correspondente a um determinado ano e em
seguida informe se este ano é ou não bissexto.*/

import java.util.Scanner;

public class Ex20 {

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
