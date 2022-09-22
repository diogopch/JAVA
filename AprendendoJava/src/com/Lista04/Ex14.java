package com.Lista04;
/*14. Foram anotadas as idades e alturas de 30 alunos. Faça um Programa que determine quantos
alunos com mais de 13 anos possuem altura inferior à média de altura desses alunos.*/

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 5;
		int[] idade = new int[TAM];
		float[] altura = new float[TAM];
		float soma_altura=0, md_alt=0;
		int cont=0;
		
		for(int i = 0; i < TAM; i++) {
			System.out.print("Informe altura: ");
			altura[i] = entrada.nextFloat();
			System.out.print("Informe idade: ");
			idade[i] = entrada.nextInt();
			
			soma_altura = soma_altura + altura[i];
			
		}
		
		md_alt = soma_altura / TAM;
		
		for(int i = 0; i < TAM; i++) {
			if((idade[i] > 13) && (altura[i] < md_alt)) {
				cont++;
			}
		}
		
		System.out.println("Quantos alunos com mais de 13 anos possuem altura inferior à média de altura desses alunos: " + cont);
		
		entrada.close();

	}

}
