package com.Lista04;
/*11. Faça um programa que tenha como entrada várias palavras separadas por ;
(rodrigo;curvello;antonio;....) separe as palavras e coloque cada uma em uma posição do
vetor*/

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String texto;
		
		System.out.print("Informe o texto: ");
		texto = entrada.nextLine();
		
		String palavra[] = texto.split(";");
		
		for(int i = 0; i < palavra.length; i++)
			System.out.print(palavra[i] + " | ");
		
		entrada.close();

	}

}
