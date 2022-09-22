package com.Lista03;
/*23. Faça um programa que calcule o número médio de alunos por turma. Para isto, peça a
quantidade de turmas e a quantidade de alunos para cada turma. As turmas não podem ter
mais de 40 alunos.*/

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int qtd_turma, qtd_aluno;
		double soma=0;
		
		System.out.println("Informe a qtd de turmas: ");
		qtd_turma = entrada.nextInt();
		
		for(int i=1; i<=qtd_turma; i++) {
			
			do {
				
				System.out.println("Informe a qtd de alunos da "+i+"ª turma: ");
				qtd_aluno = entrada.nextInt();
				
				if(qtd_aluno > 40) {
					System.out.println("Não pode ultrapassar 40..\nDigite novamente..");
				}
				
			}while(qtd_aluno>40);
			
			soma=soma+qtd_aluno;
			
		}
		
		System.out.println("Media de aluno por turma: "+(soma/qtd_turma));
		
		entrada.close();
	}

}
