package com.Lista04;
/*6. Faça um Programa que peça as quatro notas de 10 alunos, calcule e armazene num vetor a
média de cada aluno, imprima o número de alunos com média maior ou igual a 7.0.*/

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int TAM_ALUNO = 10;
		final int TAM_NT = 4;
		float[] soma = new float[TAM_ALUNO];
		float[] media = new float[TAM_ALUNO];
		float nota = 0;
		int cont = 0;
		
		for(int i = 0; i < TAM_ALUNO; i++) {
			System.out.println("Informe as notas do " + (i+1) + "º Aluno: ");
			
			nota = 0;
			soma[i] = 0;
			for(int j = 0; j < TAM_NT; j++ ) {
				System.out.print("Informe " + (j+1) + "ª nota do " + (i+1) + " aluno: ");
				nota = entrada.nextFloat();
				soma[i] = soma[i] + nota;
			}
			
			media[i] = soma[i]/(float)TAM_NT;
			
			System.out.println("Media: " + media[i]);
			
			if( media[i] >= 7) {
				cont++;
			}
						
		}
		
		System.out.println("A quantidade de alunos com nota maior ou igual a 7: " + cont);
		
		
		entrada.close();

	}

}
