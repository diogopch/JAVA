/*9. Reverso do número. Faça uma função que retorne o reverso de um número inteiro
informado. Por exemplo: 127 -> 721.*/

package com.Lista06;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int num;
		
		System.out.print("Informe o número: ");
		num = entrada.nextInt();
		
		System.out.println("Número invertido: " + inverteNumero(num));
				
		entrada.close();
	}
	
	public static int inverteNumero(int numero) {
		int i = 0;

		 while (numero > 0) {
			 i = i * 10;
			 i = i + (numero % 10);
			 numero = numero / 10;
		 }
		  return i;
	}

}
