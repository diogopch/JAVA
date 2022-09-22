package com.Lista01;
/*10.Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
a. o produto do dobro do primeiro com metade do segundo .
b. a soma do triplo do primeiro com o terceiro.
c. o terceiro elevado ao cubo.*/

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		int n1, n2;
		float n3, a, b, c;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o primeiro numero - inteiro: ");
		n1 = entrada.nextInt();
		System.out.println("Informe o segundo numero - inteiro: ");
		n2 = entrada.nextInt();
		System.out.println("Informe o terceiro numero - real: ");
		n3 = entrada.nextFloat();
		a=((2*n1)*(n2/2));
		b=((3*n1)+n3);
		c=(n3*n3*n3);
		System.out.println("a. o produto do dobro do primeiro com metade do segundo: "+a);
		System.out.println("b. a soma do triplo do primeiro com o terceiro: "+b);
		System.out.println("c. o terceiro elevado ao cubo: "+c);
		entrada.close();
	}

}
