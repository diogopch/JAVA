package com.Lista05;
/*2. Crie um programa que solicite o preço de cinco produtos em cinco supermercados
diferentes, ao final o programa deve mostrar:
• Os preços em cada um dos supermercados;
• A média de preço por produto;
• A soma de preços por supermercado;
• O valor total no supermercado mais barato e no mais caro;
Permitir gravar e ler estes dados de um arquivo.*/

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 5;
		float[][] preco = new float[TAM][TAM];
		float[] media = new float[TAM];
		float[] soma = new float[TAM];
		float caro=0, barato=0;
		
		for(int i = 0; i < TAM; i++) {
			soma[i]=0;
			for(int j = 0; j < TAM; j++) {
				
				System.out.print("Informe valor [" + i + "][" + j + "]: " );
				preco[i][j] = entrada.nextFloat();
				
				soma[i] = soma[i] + preco[i][j];
				
			}
			
			media[i] = soma[i] / (float)TAM;
			
			if(i == 0) {
				caro = soma[i];
				barato = soma[i];
			}else if(soma[i] > caro) {
				caro = soma[i];
			}else if(soma[i] < barato) {
				barato = soma[i];
			}
			
		}
		
		for(int i = 0; i < TAM; i++) {
			System.out.println("\nPreço Mercado " + i + ": ");
			for(int j = 0; j < TAM; j++) {
				System.out.printf(" - R$ %.2f", preco[i][j]);
			}
			System.out.println("\nMédia dos preços: " + media[i]);
			System.out.println("Soma dos precos: " + soma[i]);
		}
		
		System.out.printf("\nMais caro: %.2f", caro);
		System.out.printf("\nMais barato: %.2f", barato);
		
		entrada.close();

	}

}
