/*3. Faça um programa, com uma função que necessite de três argumentos, e que
forneça a soma desses três argumentos.*/

package com.Lista06;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n1, n2, n3, s;
		
		System.out.print("Informe n1: ");
		n1 = entrada.nextInt();
		System.out.print("Informe n2: ");
		n2 = entrada.nextInt();
		System.out.print("Informe n3: ");
		n3 = entrada.nextInt();
		
		s = soma(n1, n2, n3);
		
		System.out.println("Soma: " + s);
		
		entrada.close();
	}
	
	public static int soma(int x1, int x2, int x3) {
		return (x1 + x2 + x3);
	}

}
