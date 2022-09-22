package com.Lista04;
/*10. Faça um programa que peça uma data no padrão dd/mm/aaaa, valide esta data e coloque
cada item em uma posição de um vetor de inteiros de tamanho 3.*/

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int dia, mes, ano;
		int[] vet = new int[3];
		boolean controle = true;
		
		do {
			System.out.print("Informe um ano: ");
			ano = entrada.nextInt();
			
			if( ano < 0 ) {
				System.out.println("Inválido. Digite novamente.\n");
			}
			
			vet[2] = ano;
			
		}while(ano < 0);
		
		do {
			System.out.print("Informe o mes: ");
			mes = entrada.nextInt();
			
			if( mes < 1 || mes > 12) {
				System.out.println("Inválido. Digite novamente.\n");
			}
			
			vet[1] = mes;
			
		}while(mes < 1 || mes > 12);
		
		do {
			System.out.print("Informe o dia: ");
			dia = entrada.nextInt();
			
			if( (dia < 1) || ((dia > 29) && (mes == 2) && ((ano%4) == 0))) {
				controle = true; //ano bissexto e mes fevereiro
				System.out.println("Inválido. Digite novamente.");
				
			}else if( (dia < 1) || ((dia > 28) && (mes == 2)) ) {
				controle = true; //ano não bissexto e mes fevereiro
				System.out.println("Inválido. Digite novamente.");
				
			}else if ( (dia < 1) || (((dia > 30) && (mes == 4)) || (mes == 6) || (mes == 9) || (mes == 11))) {
				controle = true; //meses com só 30 dias
				System.out.println("Inválido. Digite novamente.");
			}else if((dia < 1) || (dia > 31)) {
				controle = true; //dia com mais de 31 ou menor que 0
				System.out.println("Inválido. Digite novamente.");
			}else {
				controle = false;
			}
			
			vet[0] = dia;
				
		}while(controle);
		
		for(int i = 0; i < 3; i++)
			System.out.print(vet[i] + " / ");
				
		entrada.close();

	}

}
