package com.Lista02;
/*17. Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao
longo de um semestre, e calcule a sua média. A atribuição de conceitos obedece à tabela
abaixo:
Média de Aproveitamento Conceito
Entre 9.0 e 10.0 A
Entre 7.5 e 9.0 B
Entre 6.0 e 7.5 C
Entre 4.0 e 6.0 D
Entre 4.0 e zero E

O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e
a mensagem “APROVADO” se o conceito for A, B ou C ou “REPROVADO” se o
conceito for D ou E.*/


import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		float n1, n2, media;
		char conc;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a nota 1:");
		n1 = entrada.nextFloat();
		System.out.println("Informe a nota 2: ");
		n2 = entrada.nextFloat();
		media=(n1+n2)/2;
		if(media<4) {
			conc='E';
		}else if(media<6) {
			conc='D';
		}else if(media<7.5) {
			conc='C';
		}else if(media<9) {
			conc='B';
		}else {
			conc='A';
		}
		System.out.println("Nota 1: "+n1+" Nota 2: "+n2+" Média: "+media+" Conceito: "+conc);
		switch(conc) {
		case 'A':
		case 'B':
		case 'C':
			System.out.println("Aprovado!");
		default:
			System.out.println("Reprovado");
		}
		
		entrada.close();
		
	}

}
