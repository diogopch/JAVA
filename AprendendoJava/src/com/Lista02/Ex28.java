package com.Lista02;
/*28. Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas
são:
"Telefonou para a vítima?"
"Esteve no local do crime?"
"Mora perto da vítima?"
"Devia para a vítima?"
"Já trabalhou com a vítima?"
O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita",
entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como
"Inocente".*/

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		int p1, p2, p3, p4, p5, soma;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe |0 para não| e |1 para sim|");
		System.out.println("Telefonou para a vítima?");
		p1 = entrada.nextInt();
		System.out.println("Esteve no local do crime?");
		p2 = entrada.nextInt();
		System.out.println("Mora perto da vítima?");
		p3 = entrada.nextInt();
		System.out.println("Devia para a vítima?");
		p4 = entrada.nextInt();
		System.out.println("Já trabalhou com a vítima?");
		p5 = entrada.nextInt();
		soma=p1+p2+p3+p4+p5;
		if(soma>5) {
			System.out.println("Respondeu incorretamente");
		}else {
			switch(soma){
			case 0:
			case 1:
				System.out.println("INOCENTE");
			break;
			case 2:
				System.out.println("SUSPEITA");
			break;
			case 3:
			case 4:
				System.out.println("CUMPLICE");
			break;
			case 5:
				System.out.println("ASSASINA");
			break;
			default :
				System.out.println("INOCENTE..");
			}
		}
		entrada.close();
		
	}

}
