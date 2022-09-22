package com.Lista03;
/*31. Faça um programa que leia dez conjuntos de dois valores, o primeiro representando o
número do aluno e o segundo representando a sua altura em centímetros. Encontre o aluno
mais alto e o mais baixo. Mostre o número do aluno mais alto e o número do aluno mais
baixo, junto com suas alturas.*/


import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num, na=0, nb=0;
		double alt, alto=0, baixo=0;
		
		for(int i=1; i<=10; i++) {
			
			System.out.print("Informe o número: ");
			num = entrada.nextInt();
			System.out.print("Informe a altura: ");
			alt = entrada.nextDouble();
			
			if(i == 1) {
				alto=alt;
				baixo=alt;
				na=num;
				nb=num;
			}else if(alt > alto) {
				alto=alt;
				na=num;
			}else if(alt < baixo) {
				baixo=alt;
				nb=num;
			}
			
		}
		
		System.out.println("Alto - numero: "+na+" com: "+alto);
		System.out.println("Baixo - numero: "+nb+" com: "+baixo);
		
		
		entrada.close();
	}

}
