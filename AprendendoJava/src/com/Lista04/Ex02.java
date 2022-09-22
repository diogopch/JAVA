package com.Lista04;
/*2. Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa a
ordem lida.*/

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int TAM=10;
		int[] vet = new int[TAM];
		
		for( int i = 0; i < 10; i++) {
			System.out.print("Informe o " + (i+1) + "º número: ");
			vet[i] = entrada.nextInt();
		}
		
		for( int i = 9; i >= 0; i--) {
			System.out.print(vet[i] + " - ");
		}
		
		entrada.close();

	}

}
