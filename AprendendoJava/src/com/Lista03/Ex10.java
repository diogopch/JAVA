package com.Lista03;
/*10. Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro
número elevado ao segundo número. Não utilize a função de potência da linguagem.*/

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double base;
		int exp;
		double resp=1;
		
		System.out.println("Informe a base: ");
		base = entrada.nextDouble();
		System.out.println("Informe o expoente: ");
		exp = entrada.nextInt();
		
		for(int i=1; i<=exp; i++) {
			
			resp=resp*base;
			
		}
		
		System.out.println("Resposta: "+resp);
		
		
		entrada.close();

	}

}
