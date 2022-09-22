package com.Lista03;
/*9. Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro
entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve
ser conforme o exemplo abaixo:
• Tabuada de 5:
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50*/

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num;
		
		System.out.println("Informe o número: ");
		num = entrada.nextInt();
		
		if((num >= 0) && (num <=10)) {
			
			for (int i=1; i<=10; i++) {
				
				System.out.println(num+" X "+i+" = "+(num*i));
				
			}
		}else {
			System.out.println("Número inválido.");
		}
		
		
		
		entrada.close();

	}

}
