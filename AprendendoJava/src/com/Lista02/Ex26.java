package com.Lista02;
/*26. Faça um Programa que peça um número e informe se o número é inteiro ou decimal.
Dica: utilize uma função de arredondamento.*/

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		float n;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um número: ");
		n = entrada.nextFloat();
		if(n%1==0) {
			System.out.println("INTEIRO");
		}else {
			System.out.println("DECIMAL");
		}
		
		entrada.close();
	}

}
