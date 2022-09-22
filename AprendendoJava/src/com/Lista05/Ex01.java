package com.Lista05;
/*1. Faça um programa que peça ao usuário um valor inteiro impar entre 3 e 11 (inclusive 3 e
11, valide esta entrada), após isto crie uma matriz quadrada (inteiros) do tamanho do número
informado pelo usuário. Permita que o usuário informe os valores para cada uma das
posições da matriz. Após isto calcula e mostre as seguintes informações sobre a matriz:
• Soma dos elementos;
• Média dos elementos (duas casas decimais);
• Maior valor;
• Menor valor;
• Contador de pares;
• Contador de ímpares;
• Soma da diagonal principal;
• Soma da diagonal secundária;
• Mostrar a Matriz (formatada);
Permitir gravar e ler estes dados de um arquivo.*/

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num, soma=0, maior=0, menor=0, impar=0, par=0, soma_diag=0, soma_sec=0;
		float media=0;
		
		do {
			System.out.print("Informe um numero entre 3 e 11: ");
			num = entrada.nextInt();
			
			if(((num%2)==0) || (num < 3) || (num >11)) {
				System.out.println("Inválido. Informe novamente....");
			}
		}while(((num%2)==0) || (num < 3) || (num >11));
		
		int[][] mat = new int[num][num];
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				
				System.out.print("Valor [" + i + "][" + j + "]: " );
				mat[i][j] = entrada.nextInt();
				
				soma = soma + mat[i][j];
				
				if(i == 0 && j == 0) {
					maior = mat[i][j];
					menor = mat[i][j];
				}else if(mat[i][j] > maior) {
					maior = mat[i][j];
				}else if(mat[i][j] < menor) {
					menor = mat[i][j];
				}
				
				if((mat[i][j] % 2) == 0) {
					par++;
				}else {
					impar++;
				}
				
				if(i == j) {
					soma_diag = soma_diag + mat[i][j];
				}
				if((i+j) == (num-1)) {
					soma_sec = soma_sec + mat[i][j];
				}
				//00 01 02
				//10 11 12
				//20 21 22
				
			}
		}
		
		media = (float)soma / (num*num);
		System.out.println("Soma: " + soma);
		System.out.printf("Média: %.2f", media);
		System.out.println("\nMaior: " + maior + " - Menor: " + menor);
		System.out.println("Par: " + par + " - Impar: " + impar);
		System.out.println("Soma diagonal principal: " + soma_diag + " - Soma diagonal secundária: " + soma_sec);
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println("");
		}
		
		entrada.close();
	}

}
