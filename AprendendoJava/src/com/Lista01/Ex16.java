package com.Lista01;
/*16.Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em
metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro
para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam
R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
o Informe ao usuário as quantidades de tinta a serem compradas e os respectivos
preços em 2 situações:
o comprar apenas latas de 18 litros;
o comprar apenas galões de 3,6 litros;*/

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		double tam, latas18, latas36;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o tamanho da area a ser pintada: ");
		tam = entrada.nextDouble();
		latas18=((tam/6)/18);
		int latasc18 = (int)Math.ceil(latas18);
		latas36=((tam/6)/3.6);
		int latasc36 = (int)Math.ceil(latas36);
		System.out.println("Qtd latas 18 litros: "+latasc18+" Valor: R$ "+(latasc18*80.00));
		System.out.println("Qtd latas 3,6 litros: "+latasc36+" Valor: R$ "+(latasc36*25.00));
		
		entrada.close();

	}

}
