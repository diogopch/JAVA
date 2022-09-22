package com.Lista01;
/*7. Faça um Programa que calcule e mostre a área de um quadrado.*/

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		float lado, area;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o lado do quadrado: ");
		lado = entrada.nextFloat();
		area=lado*lado;
		System.out.println("Área: "+area);
				
		entrada.close();
		
	}

}
