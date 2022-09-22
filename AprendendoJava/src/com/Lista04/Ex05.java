package com.Lista04;
/*5. Faça um Programa que leia 20 números inteiros e armazene-os num vetor. Armazene os
números pares no vetor PAR e os números IMPARES no vetor impar. Imprima os três
vetores.*/

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 20;
		int[] num = new int[TAM];
		int[] par = new int[TAM];
		int[] impar = new int[TAM];
		int contp = 0, conti = 0;
		
		for(int i = 0; i < TAM; i++) {
			System.out.print("Informe o " + (i+1) + "º valor: ");
			num[i] = entrada.nextInt();
			
			if((num[i]%2) == 0) {
				par[contp]=num[i];
				contp++;
			}else {
				impar[conti]=num[i];
				conti++;
			}
		}
		
		System.out.println("VETOR INTEIRO: ");
		for(int i = 0; i< TAM; i++)
			System.out.print(num[i] + " - ");

		System.out.println("\nVETOR PAR: ");
		for(int i = 0; i< contp; i++)
			System.out.print(par[i] + " - ");
		
		System.out.println("\nVETOR IMPAR: ");
		for(int i = 0; i< conti; i++)
			System.out.print(impar[i] + " - ");
		
		entrada.close();

	}

}
