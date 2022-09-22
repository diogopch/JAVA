package com.Lista03;
/*11. Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de
números pares e a quantidade de números impares.*/

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num, qtd_par=0, qtd_impar=0;
		
		for(int i=1; i<=10; i++) {
			
			System.out.print("Informe o "+i+"º numero: ");
			num = entrada.nextInt();
			
			if((num % 2) == 0) {
				qtd_par++;
			}else {
				qtd_impar++;
			}
			
		}
		
		System.out.println("QTD PAR: "+qtd_par+"\nQTD IMPAR: "+qtd_impar);
		
		
		entrada.close();

	}

}
