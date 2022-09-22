package com.Lista04;
/*7. Faça um Programa que leia um vetor de 5 números inteiros, mostre a soma, a multiplicação
e os números.*/

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 5;
		int[] vet = new int[TAM];
		int soma = 0;
		float mult = 1;
		
		for( int i = 0; i < TAM; i++) {
			
			System.out.print("Informe um número: ");
			vet[i] = entrada.nextInt();
			
			soma = soma + vet[i];
			mult = mult * vet[i];
			
		}
		
		for( int i = 0; i < TAM; i++)
			System.out.print(vet[i] + " - ");
		
		System.out.println("SOMA: " + soma);
		System.out.println("MULTIPLICAÇÃO: " + mult);
		
		
		entrada.close();

	}

}
