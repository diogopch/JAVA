/*4. Faça um programa, com uma função que necessite de um argumento. A função
retorna o valor de caractere ‘P’, se seu argumento for positivo, e ‘N’, se seu
argumento for zero ou negativo.*/

package com.Lista06;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n;
		char r;
		
		System.out.print("Informe um número: ");
		n = entrada.nextInt();
		
		r = posNeg(n);
		
		System.out.println(r);		
		
		entrada.close();

	}
	
	public static char posNeg(int x) {
		if(x > 0) {
			return('P');
		}else {
			return('N');
		}
	}

}
