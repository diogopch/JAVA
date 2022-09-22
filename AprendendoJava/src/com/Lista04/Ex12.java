package com.Lista04;
/*12. Faça um Programa que peça a idade e a altura de 5 pessoas, armazene cada informação no
seu respectivo vetor. Imprima a idade e a altura na ordem inversa a ordem lida. Mostrar
também idade e altura do mais velho, mais novo, mais baixo e mais alto. Mostrar idade e
altura de quem está abaixo e acima da média de idade e altura;*/

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 5;
		int[] idade = new int[TAM];
		float[] alt = new float[TAM];
		int velho=0, novo=0, soma_id=0;
		float alto=0, baixo=0, soma_alt=0, md_alt=0, md_id=0;
		
				
		for(int i = 0; i < TAM; i++) {
			
			System.out.print("Informe idade: ");
			idade[i] = entrada.nextInt();
			System.out.print("Informe altura: ");
			alt[i] = entrada.nextFloat();
			
			soma_alt = soma_alt + alt[i];
			soma_id = soma_id + idade[i];
						
			if(i == 0) {
				velho = idade[i];
				novo = idade[i];
				alto = alt[i];
				baixo = alt[i];
			}else {
				
				if(idade[i] > velho) {
					velho = idade[i];
				}else if(idade[i] < novo) {
					novo = idade[i];
				}
				
				if(alt[i] > alto) {
					alto = alt[i];
				}else if(alt[i] < baixo) {
					baixo = alt[i];
				}
				
			}
						
		}
		
		System.out.println("\nOrdem inversa altura: ");
		for(int i = TAM-1; i >= 0; i--)
			System.out.print(alt[i] + " - ");
		
		System.out.println("\nOrdem inversa idade: ");
		for(int i = TAM-1; i >= 0; i--)
			System.out.print(idade[i] + " - ");
		
		System.out.println("\nMaior altura: " + alto+ " - Menor altura: " + baixo);
		System.out.println("Maior idade: " + velho+ " - Menor idade: " + novo);
		
		md_id = (float)soma_id / TAM;
		md_alt = soma_alt / TAM;
		
		System.out.println("Média altura: " + md_alt + " - Média idade: " + md_id);
		
		System.out.println("\nIdades acima da media: ");
		for(int i = 0; i < TAM; i++) {
			if(idade[i] >= md_id) {
				System.out.print(idade[i] + " - ");
			}
		}
		
		System.out.println("\nIdades baixo da media: ");
		for(int i = 0; i < TAM; i++) {
			if(idade[i] < md_id) {
				System.out.print(idade[i] + " - ");
			}
		}
		
		System.out.println("\nAlturas acima da media: ");
		for(int i = 0; i < TAM; i++) {
			if(alt[i] >= md_alt) {
				System.out.print(alt[i] + " - ");
			}
		}
		
		System.out.println("\nAlturas abaixo da media: ");
		for(int i = 0; i < TAM; i++) {
			if(alt[i] < md_alt) {
				System.out.print(alt[i] + " - ");
			}
		}
			
		
		entrada.close();

	}

}
