package com.Lista01;
/*11.Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que
calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) – 58.*/

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		double alt, peso_ideal;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a altura: ");
		alt = entrada.nextDouble();
		peso_ideal=((72.2*alt)-58);
		System.out.println("O peso ideal é: "+peso_ideal);
		entrada.close();
	}

}
