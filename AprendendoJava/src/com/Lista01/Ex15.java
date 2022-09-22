package com.Lista01;
/*15.Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em
metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro
para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam
R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o
preço total.*/

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		double tam, latas;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o tamanho da area a ser pintada: ");
		tam = entrada.nextDouble();
		latas=((tam/3)/18);
		int latasc = (int)Math.ceil(latas);
		System.out.println("Qtd latas: "+latasc+" Valor: R$ "+(latasc*80.00));
		entrada.close();
	}

}
