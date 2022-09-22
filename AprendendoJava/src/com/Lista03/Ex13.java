package com.Lista03;
/*13. Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120*/

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num, fat=1;
		
		System.out.print("Informe um número: ");
		num = entrada.nextInt();
		
		System.out.println(num+"! = ");
		
		for(int i=1; i<=num; i++) {
			
			fat=fat*i;
			System.out.print(i+".");
		}
		
		System.out.print(" = "+fat);
		
		entrada.close();
	}

}
