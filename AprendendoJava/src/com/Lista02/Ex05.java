package com.Lista02;
/*5. Faça um Programa que verifique se uma letra digitada é vogal.*/

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		char letra;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe uma letra: ");
		letra = entrada.nextLine().charAt(0);
		if ((letra=='a')||(letra=='e')||(letra=='i')||(letra=='o')||(letra=='u')) {
			System.out.println("A letra informada é vogal.");
		}else {
			System.out.println("A letra Informada é consoante.");
		}
		
		entrada.close();
		
	}

}
