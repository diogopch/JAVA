package com.Lista04;
/*4. Faça um Programa que leia um vetor de 10 caracteres, e diga quantas consoantes foram
lidas. Imprima as consoantes.*/

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 10;
		char[] vet = new char[TAM];
		int qtd_consoante = 0;
		
		for(int i = 0; i < TAM; i++) {
			System.out.print("Informe a " +(i+1) + "ª letra: ");
			vet[i] = entrada.nextLine().charAt(0);
			
			if( vet[i]=='a' || vet[i]=='e' || vet[i]=='i' || vet[i]=='o' || vet[i]=='u' ) {
				
			}else {
				qtd_consoante++;
			}
		}
		
		for(int i = 0; i < TAM; i++) {
						
			if( vet[i]=='a' || vet[i]=='e' || vet[i]=='i' || vet[i]=='o' || vet[i]=='u' ) {
				
			}else {
				System.out.print(vet[i] + " - ");
			}
		}
		System.out.println("\nQuantidade de consoantes: " + qtd_consoante);
		
		entrada.close();

	}

}
