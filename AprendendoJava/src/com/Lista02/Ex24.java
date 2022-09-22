package com.Lista02;
/*24. Faça um Programa para leitura de três notas parciais de um aluno. O programa deve
calcular a média alcançada por aluno e presentar:

◦ A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva
média alcançada;
◦ A mensagem "Reprovado", se a média for menor do que 7, com a respectiva
média alcançada;
◦ A mensagem "Aprovado com Distinção", se a média for igual a 10.*/

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		float n1, n2, n3, media;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a nota 1:");
		n1 = entrada.nextFloat();
		System.out.println("Informe a nota 2: ");
		n2 = entrada.nextFloat();
		System.out.println("Informe a nota 3: ");
		n3 = entrada.nextFloat();
		media=(n1+n2+n3)/3;
		if(media>=7) {
			if(media==10) {
				System.out.println("Aprovado com distinção: "+media);
			}else {
				System.out.println("Aprovado: "+media);
			}
		}else {
			System.out.println("Reprovado: "+media);
		}
		
		entrada.close();
		
	}

}
