package com.Lista02;
/*16. Altere o programa que calcula a média do aluno, e mostre a mensagem de acordo com a
média. De 0 a 3 - Reprovado, de 3 a 6.9 - Em Exame, de 7 a 10 - Aprovado*/


import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		float n1, n2, media;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a nota 1:");
		n1 = entrada.nextFloat();
		System.out.println("Informe a nota 2: ");
		n2 = entrada.nextFloat();
		media=(n1+n2)/2;
		if(media<3) {
			System.out.println("Reprovado: "+media);
		}else if(media<6.9) {
			System.out.println("Em exame: "+media);
		}else {
			System.out.println("Aprovado: "+media);
		}
		entrada.close();
		
	}

}
