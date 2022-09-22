package com.Lista03;
/*16. Faça um programa que, dado um conjunto de N números, determine o menor valor, o
maior valor e a soma dos valores.*/

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n;
		double termo, maior=0, menor=0;
		
		do {
			System.out.println("Informe o tamanho do conjunto: ");
			n = entrada.nextInt();
			
			if(n<=0) {
				System.out.println("Inválido. Digite novamente.");
			}
		}while(n<=0);
		
		for(int i=1; i<=n; i++) {
			System.out.print("Informe o "+i+"º numero: ");
			termo = entrada.nextDouble();
			
			if(i == 1) {
				maior=termo;
				menor=termo;
			}else if(termo > maior) {
				maior=termo;
			}else if(termo < menor) {
				menor=termo;
			}
		}
		
		System.out.println("Maior: "+maior+"\nMenor: "+menor);
		
		
		
		
		
		
		
		entrada.close();

	}

}
