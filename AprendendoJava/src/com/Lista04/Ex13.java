package com.Lista04;
/*13. Faça um Programa que leia dois vetores com 10 elementos cada. Gere um terceiro vetor de
20 elementos, cujos valores deverão ser compostos pelos elementos intercalados dos dois
outros vetores.*/

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 10;
		int[] vet1 = new int[TAM];
		int[] vet2 = new int[TAM];
		int[] vet3 = new int[TAM*2];
		
		for(int i = 0; i < TAM; i++) {
			System.out.print("Informe o valor do vet1: ");
			vet1[i] = entrada.nextInt();
			System.out.print("Informe o valor do vet2: ");
			vet2[i] = entrada.nextInt();
		}
		
		for(int i = 0; i < TAM; i++) {
			vet3[i] = vet1[i];
			vet3[i+TAM] = vet2[i];
		}
			
		System.out.println("\n");
		
		for(int i = 0; i < TAM*2; i++)
			System.out.print(vet3[i] + " - ");
		
		entrada.close();

	}

}
