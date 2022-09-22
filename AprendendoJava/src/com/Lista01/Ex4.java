package com.Lista01;
/*4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.*/

import java.util.Scanner;

public class Ex4 {
	
	public static void main(String[] args) {
		float n1, n2, n3, n4, md;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a primeira Nota: ");
		n1 = entrada.nextFloat();
		System.out.println("Informe a segunda Nota: ");
		n2 = entrada.nextFloat();
		System.out.println("Informe a terceira Nota: ");
		n3 = entrada.nextFloat();
		System.out.println("Informe a quarta Nota: ");
		n4 = entrada.nextFloat();
		entrada.close();
		md = (n1+n2+n3+n4)/4;
		System.out.println("A média é: "+md);

	}

}
