package com.Lista04;
/*3. Faça um Programa que leia 4 notas, mostre as notas e a média na tela.*/

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 4;
		float[] nota = new float[TAM];
		float soma = 0, media = 0;
		
		for(int i = 0; i < 4; i++) {
			System.out.print("Informe a " + (i+1) + "ª nota: ");
			nota[i] = entrada.nextFloat();
			soma += nota[i];
		}
		
		for( int i = 0; i < 4; i++) {
			System.out.print(" " + (i+1) + "ª Nota: " + nota[i]);
		}
		media = soma / TAM;
		System.out.println("\nMédia: " + media);
		
		entrada.close();

	}

}
