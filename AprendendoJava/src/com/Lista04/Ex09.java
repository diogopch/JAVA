package com.Lista04;
/*9. Faça um programa que peça um texto e coloque-o em um vetor onde cada carácter ocupará
uma posição do vetor.*/

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String texto;
		int qtd_letras;
		
		System.out.print("Informe o texto: ");
		texto = entrada.nextLine();
		
		qtd_letras = texto.length();
		char[] vet = new char[qtd_letras];
		
		for(int i = 0; i < qtd_letras; i++)
			vet[i] = texto.charAt(i);
		
		for(int i = 0; i < qtd_letras; i++)
			System.out.print(vet[i]);
		
		
		entrada.close();

	}

}
