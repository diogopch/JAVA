package com.Lista03;
/*1. Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor
seja inválido e continue pedindo até que o usuário informe um valor válido.*/

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		float nota;
		
		Scanner entrada = new Scanner(System.in);
		
		do {
			
			System.out.println("Informe uma nota: ");
			nota = entrada.nextFloat();
			
		}while( (nota >= 0) && (nota <=10) );
		
		entrada.close();

	}

}
