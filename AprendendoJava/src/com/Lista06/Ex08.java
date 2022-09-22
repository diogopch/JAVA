/*8. Faça uma função que informe a quantidade de dígitos de um determinado número
inteiro informado.*/

package com.Lista06;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int num;
		
		System.out.print("Informe o número: ");
		num = entrada.nextInt();
		
		int qtd = qtdDigitos(num);
		
		System.out.println("Quantidade de dígitos: " + qtd);
		
		entrada.close();
	}
	
	public static int qtdDigitos(int n) {
		String s = Integer.toString(n);
		return(s.length());
	}

}
