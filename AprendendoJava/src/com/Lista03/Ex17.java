package com.Lista03;
/*17. Faça um programa que peça um número inteiro e determine se ele é ou não um número
primo. Um número primo é aquele que é divisível somente por ele mesmo e por 1.*/

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num, cont=0;
		
		System.out.print("Informe o número para consulta se é primo: ");
		num = entrada.nextInt();
		
		for(int i=1; i<=num; i++) {
			
			if((num%i) == 0) {
				cont++;
			}
			
		}
		
		if(cont > 2) {
			System.out.println("Não é primo.");
		}else {
			System.out.println("É primo.");
		}
		
		
		entrada.close();

	}

}
