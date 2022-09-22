package com.Lista02;
/*25. Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário a
valor do saque e depois informar quantas notas de cada valor serão fornecidas. As notas
disponíveis serão as de 1, 5, 10, 50 e 100 reais. O valor mínimo é de 10 reais e o máximo de
600 reais. O programa não deve se preocupar com a quantidade de notas existentes na
máquina.
Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma
nota de 50, uma nota de 5 e uma nota de 1;
Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma
nota de 50, quatro notas de 10, uma nota de 5 e quatro notas de 1.*/

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		int saque, c, d, u;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o valor do saque: ");
		saque = entrada.nextInt();
		if (saque<10) {
			System.out.println("Saque inválido. Mínimo 10,00 e Máximo 600,00");
		}else if(saque>600) {
			System.out.println("Saque inválido. Mínimo 10,00 e Máximo 600,00");
		}else {
			c=(saque/100);
			d=(saque%100);
			u=((saque%100)%10);
			System.out.println(c+d+u);
			if(c>0) {
				System.out.println("Total notas de R$100: "+c/100);
			}
			if(d>0) {
				if(d<50) {
					System.out.println("Total de notas de R$10,00: "+d/10);
				}else if(d==50) {
					System.out.println("Total de notas de R$50,00: 1");
				}else {
					System.out.println("Total de notas de R$50,00: 1");
					System.out.println("Total de notas de R$10,00"+(d-50)/10);
				}
			}
			if(u>0) {
				if (u==5) {
					System.out.println("Total de notas de R$5,00: 1");
				}else if(u<5) {
					System.out.println("Total de notas de R$1,00: "+u);
				}else {
					System.out.println("Total de notas de R$5,00: 1");
					System.out.println("Total de notas de R$1,00: "+(u-5));
				}
			}
		}
		
		entrada.close();

	}

}
