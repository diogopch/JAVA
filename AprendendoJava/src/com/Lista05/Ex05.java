package com.Lista05;
/*5. Criar uma loteria com 6 números de 1 a 60. Solicitar ao usuário quantas cartelas deseja
preencher criar uma matriz deste tamanho para armazenar os valores que serão criados
aleatoriamente. No final analisar cada uma das cartelas e mostrar ao lado do números (ordenados
em ordem crescente e não repetidos dentro da mesma cartela) o total de acertos.*/

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Ex05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random random = new Random();
		
		System.out.print("Informe quantos jogos quer fazer: ");
		int n = entrada.nextInt();
		
		int[][] loteria = new int[n][6];
		int[] resultado = new int[6];
		int[] acertos = new int[n];
		int[] aux = new int[6];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 6; j++) {
				System.out.print("Informe o " + (j+1) + "º número da " + (i+1) + "ª cartela: ");
				loteria[i][j] = entrada.nextInt();
				aux[j] = loteria[i][j];
			}
			
			Arrays.sort(aux);
			for(int x = 0; x < 6; x++)
				loteria[i][x] = aux[x];
		}
		
		for(int i = 0; i < 6; i++)
			resultado[i] = random.nextInt(60);
		
		Arrays.sort(resultado);
		
		System.out.println("\nResultado: ");
		for(int i = 0; i < 6; i++)
			System.out.print(resultado[i] + " | ");
		
		System.out.println("");
		
		for(int i = 0; i < n; i++) {
			acertos[i] = 0;
			
			System.out.println("\nCartela do jogo: " + (i+1));
			for(int y = 0; y < 6; y++) {
				System.out.print(loteria[i][y] + " | ");
			}
			
			System.out.println("");
				
			for(int j = 0; j < 6; j++) {
				for(int k = 0; k < 6; k++) {
					if(loteria[i][j] == resultado[k]) {
						System.out.println("Acertou o número: " + loteria[i][j] + " na cartela número: " + (i+1));
						acertos[i]++;
					}
				}
			}
			if(acertos[i] == 6) {
				System.out.println("Esta cartela ganhou na loteria.");
			}else {
				System.out.println("Total de acertos: " + acertos[i]);
			}
		}
		
		
		
		
		entrada.close();
	}

}
