package com.Lista02;
/*8. Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve
calcular a média alcançada pelo aluno e apresentar:
o A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
o A mensagem "Reprovado", se a média for menor do que sete;*/

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		float n1, n2, media;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a nota 1:");
		n1 = entrada.nextFloat();
		System.out.println("Informe a nota 2: ");
		n2 = entrada.nextFloat();
		media=(n1+n2)/2;
		if(media>=7) {
			System.out.println("Aprovado: "+media);
		}else {
			System.out.println("Reprovado: "+media);
		}
		
		entrada.close();
		
	}

}
