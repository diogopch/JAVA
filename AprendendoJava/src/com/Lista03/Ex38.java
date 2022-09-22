package com.Lista03;
/*• Faça um programa que peça um numero inteiro positivo e em seguida mostre este numero
invertido.
• Exemplo:
12376489
=> 98467321*/

import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num, num_inv = 0;
		
		System.out.println("Informe um número para ser invertido: ");
		num = entrada.nextInt();
		
        while (num > 0) {
            num_inv = num_inv *10;
            num_inv = num_inv + (num % 10);
            num = num / 10;
		}
		System.out.print("Número invertido: "+num_inv);
		
		entrada.close();

	}

}
