package com.Lista01;
/*9. Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a
temperatura em graus Celsius.
C = (5 * (F-32) / 9) / C = (F – 32) / 1,8*/

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		float tempf, tempc;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a temperatura em graus Farenheit");
		tempf = entrada.nextFloat();
		tempc=(5*(tempf-32)/9);
		System.out.println("A temperatura em graus celsius é: "+tempc);
		entrada.close();

	}

}
