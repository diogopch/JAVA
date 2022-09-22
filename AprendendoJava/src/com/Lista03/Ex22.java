package com.Lista03;
/*22. Numa eleição existem três candidatos. Faça um programa que peça o número total de
votantes. Peça para cada votante votar e ao final mostrar o número de votos de cada
candidato.*/

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int c1=0, c2=0, c3=0, bn=0, qtd, voto;
		
		System.out.println("Informe o total de votantes: ");
		qtd = entrada.nextInt();
		
		for(int i=1; i<=qtd; i++) {
			System.out.print("Informe o voto para candidato 1, 2 ou 3: ");
			voto = entrada.nextInt();
			switch(voto) {
			case 1 :
				c1++;
			break;
			case 2 :
				c2++;
			break;
			case 3 :
				c3++;
			default :
				bn++;
			break;
				
			}
		}
		
		System.out.println("Candidato 1: "+c1);
		System.out.println("Candidato 2: "+c2);
		System.out.println("Candidato 3: "+c3);
		System.out.println("Brancos e nulos: "+bn);
		
		entrada.close();
	}

}
