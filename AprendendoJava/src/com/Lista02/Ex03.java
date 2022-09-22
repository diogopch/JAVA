package com.Lista02;
/*3. Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra
escrever: F - Feminino, M - Masculino.*/

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		char letra;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a letra: ");
		letra = entrada.nextLine().charAt(0);
		if ((letra=='F')||(letra=='f')) {
			System.out.println("F - Feminino");
		}else {
			if ((letra=='M')||(letra=='m')) {
				System.out.println("M - Masculino");
			}else {
				System.out.println("Letra informada inválida.");
			}
		}
		
		entrada.close();

	}

}
