package com.Lista05;
/*3. Utilizando a estrutura de matriz, faça um programa que para um colégio que tem N (deve
ser informado no início do programa) alunos e estes são avaliados em duas provas. O
programa deve permitir digitação do nome do aluno e das duas notas e após isto mostrar as
seguintes informações:
• Nome e as duas Notas de cada aluno;
• A média de cada aluno;
• A maior e menor nota (nome do aluno junto);
• A maior e menor média (nome do aluno junto);
• A média geral da turma;
• O nome dos alunos acima e abaixo da Media Geral da Turma;*/

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n;
				
		System.out.print("Informe a qtd de alunos: ");
		n = entrada.nextInt();
		
		String[] aluno = new String[n];
		float[][] nota = new float[n][2];
		float[] media = new float[n];
		
		float soma=0, soma_geral=0, maior_media=0, menor_media=0, maior_nota=0, menor_nota=0, media_geral=0;
		String al_maior_nt="", al_menor_nt="", al_maior_md="", al_menor_md="";
		
		for(int i = 0; i < n; i++) {
			
			entrada.nextLine();
			System.out.println("Nome do " + (i+1) + "º aluno: ");
			aluno[i] = entrada.nextLine();
			
			soma = 0;
						
			for(int j = 0; j < 2; j++) {
				
				System.out.println("Infomre a nota " + (j+1) + " do " + (i+1) + "º aluno: ");
				nota[i][j] = entrada.nextFloat();
				
				soma = soma + nota[i][j];
				soma_geral = soma_geral + nota[i][j];
				
				if(i == 0 && j == 0) {
					maior_nota = nota[i][j];
					menor_nota = nota[i][j];
					al_maior_nt = aluno[i];
					al_menor_nt = aluno[i];
				}else if(nota[i][j] > maior_nota) {
					maior_nota = nota[i][j];
					al_maior_nt = aluno[i];
				}else if(nota[i][j] < menor_nota) {
					menor_nota = nota[i][j];
					al_menor_nt = aluno[i];
				}
				
			}
			
			media[i] = soma/2;
			
			if(i == 0) {
				maior_media = media[i];
				menor_media = media[i];
				al_maior_md = aluno[i];
				al_menor_md = aluno[i];
			}else if(media[i] > maior_media) {
				maior_media = media[i];
				al_maior_md = aluno[i];
			}else if(media[i] < menor_media) {
				menor_media = media[i];
				al_menor_md = aluno[i];
			}
		}
				
		for(int i = 0; i < n; i++) {
			
			System.out.print("\n\nNome do " + (i+1) + "º aluno: " + aluno[i] + "\nNotas: ");
			
			for(int j = 0; j < 2; j++) {	
				System.out.print(nota[i][j] + " - ");
			}
			
			System.out.print("Média: " + media[i]);
		}
		
		media_geral = soma_geral / (2*n);
		
		System.out.println("\n\nA maior nota é: " + maior_nota + " do aluno: " + al_maior_nt);
		System.out.println("A menor nota é: " + menor_nota + " do aluno: " + al_menor_nt);
		System.out.println("A maior média é: " + maior_media + " do aluno: " + al_maior_md);
		System.out.println("A menor media é: " + menor_media + " do aluno: " + al_menor_md);
		System.out.println("Média geral: " + media_geral);
		
		System.out.println("Alunos Acima da média geral: ");
		for(int i =0; i < n; i++) {
			if(media[i] >= media_geral) {
				System.out.print(aluno[i] + " | ");
			}
		}
		
		System.out.println("\nAlunos Abaixo da média geral: ");
		for(int i =0; i < n; i++) {
			if(media[i] < media_geral) {
				System.out.print(aluno[i] + " | ");
			}
		}
		
		
		entrada.close();

	}

}
