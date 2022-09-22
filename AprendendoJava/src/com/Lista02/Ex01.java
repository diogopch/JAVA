package com.Lista02;
/*1. Faça um Programa que peça dois números e imprima o maior deles.*/

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		int n1, n2, maior;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o primeiro numero:");
		n1 = entrada.nextInt();
		System.out.println("Informe o segundo numero: ");
		n2 = entrada.nextInt();
		if (n1>n2) {
			maior=n1;
			System.out.println("O maior é: "+maior);
		}else {
			if (n1==n2) {
				System.out.println("Os números são iguais.");
			}else {
				System.out.println("O maior é: "+n2);
			}
		}
		
		entrada.close();

	}

}