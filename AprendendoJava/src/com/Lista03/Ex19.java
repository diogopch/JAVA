package com.Lista03;
/*19. Faça um programa que mostre todos os primos entre 1 e N sendo N um número inteiro
fornecido pelo usuário. O programa deverá mostrar também o número de divisões que ele
executou para encontrar os números primos.*/

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num, cont=0, contgeral=0;
		
		System.out.print("Informe um número: ");
		num = entrada.nextInt();
		
		for(int i=1; i<=num; i++) {
			
			cont=0;
			
			for(int j=1; j<=i; j++) {
				
				if((i%j) == 0) {
					cont++;
				}
				
				contgeral++;
			}
			if((cont == 2)) {
				System.out.print(i+" - ");
			}
				
		}
		
		System.out.println("\nForam realizadas "+contgeral+" divisões no total.");
		
		entrada.close();

	}

}