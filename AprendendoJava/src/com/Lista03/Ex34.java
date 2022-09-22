package com.Lista03;
/*34. Faça um programa que leia uma quantidade indeterminada de números positivos e conte
quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada
de dados deverá terminar quando for lido um número negativo.*/

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double num=0;
		int cont0_25=0, cont26_50=0, cont51_75=0, cont76_100=0;
		
		while(num >= 0) {
			
			System.out.print("Informe um número: ");
			num = entrada.nextDouble();
			
			if(num >= 0) {
				
				if((num>=0) && (num<=25)) {
					cont0_25++;
				}else if((num>=26) && (num<=50)) {
					cont26_50++;
				}else if((num>=51) && (num<=75)) {
					cont51_75++;
				}else if((num>=76) && (num<=100)) {
					cont76_100++;
				}
				
			}
		}
		
		System.out.println("[0 a 25]: "+cont0_25);
		System.out.println("[26 a 50: "+cont26_50);
		System.out.println("[51 a 75]: "+cont51_75);
		System.out.println("[76 a 100]: "+cont76_100);
		
		entrada.close();
	}

}
