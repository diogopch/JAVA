package com.Lista01;
/*2. Faça um Programa que peça um número e então mostre a mensagem O número
informado foi [número].*/

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		int num;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um número: ");
		num = entrada.nextInt();
		System.out.println("O número informado foi: " +num);
		
		entrada.close();
	}

}
