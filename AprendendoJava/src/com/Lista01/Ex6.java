package com.Lista01;
/*6. Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.*/

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		double raio, area;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o raio do círculo: ");
		raio = entrada.nextDouble();
		area=3.14*raio*raio;
		System.out.println("A área do círculo é: "+area);
		
		entrada.close();				

	}

}
