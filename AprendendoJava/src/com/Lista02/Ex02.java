package com.Lista02;
/*2. Faça um Programa que peça um valor e mostre na tela se o valor é positivo, negativo
ou zero.*/

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		double num;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um número: ");
		num = entrada.nextDouble();
		if (num>0) {
			System.out.println("Este número é positivo.");
		}else {
			if (num==0) {
				System.out.println("Este número é igual a zero.");
			}else {
				System.out.println("Este número é negativo.");
			}
		}
		entrada.close();

	}

}
