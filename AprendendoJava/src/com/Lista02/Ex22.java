package com.Lista02;
/*22. Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade
de centenas, dezenas e unidades do mesmo.*/

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		int num, c, d, u;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um número inteiro menor que 1000: ");
		num = entrada.nextInt();
		if(num<1000) {
			c=num/100;
			d=num%100;
			u=(num%100)%10;
			System.out.println("Centena: "+c+" / Dezena: "+d+" / Unidade: "+u);			
		}else {
			System.out.println("Número inválido.");
		}
		
		entrada.close();
		
	}

}
