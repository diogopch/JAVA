package com.Lista01;
/*12.Tendo como dado de entrada a altura, construa um algoritmo que calcule seu peso ideal,
utilizando as seguintes fórmulas:
Para homens: (72.7*h) - 58
Para mulheres: (62.1*h) - 44.7 (h = altura)*/

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		double alt, phom, pmul;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a altura: ");
		alt = entrada.nextDouble();
		phom=((72.7*alt)-58);
		pmul=((62.1*alt)-44.7);
		System.out.println("Peso ideal Para Homens: "+phom+" kg Para Mulheres: "+pmul+" kg");
		
		entrada.close();

	}

}
