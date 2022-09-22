package com.Lista04;
/*1. Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.*/

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 5;
		int[] vet = new int[TAM];
		
		for( int i = 0; i < 5; i++) {
			
			System.out.print("Informe " + (i+1) + "º número: ");
			vet[i] = entrada.nextInt();
						
		}
		
		System.out.println("Os valores são: ");
		
		for( int i = 0; i < 5; i++) {
			System.out.print(vet[i] + " - ");
		}
		
		entrada.close();
	}

}
