package com.Lista01;
/*5. Faça um Programa que converta metros para centímetros.*/

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		float x, xconv;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o valor em metros a ser convertido: ");
		x = entrada.nextFloat();
		xconv=x*100;
		System.out.println("O valor em centímetro é: "+xconv+" cm");
		
		entrada.close();

	}

}
