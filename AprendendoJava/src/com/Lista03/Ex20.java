package com.Lista03;
/*20. Faça um programa que calcule e mostre a média aritmética de N notas.*/

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int qtd_notas=0, op;
		float nota, soma=0;
		boolean controle=true;
		
		do {
			
			System.out.println("Informe a nota: ");
			nota = entrada.nextFloat();
			
			System.out.print("Deseja informar mais uma nota - 1 SIM | - 2 NÃO: ");
			op = entrada.nextInt();
			
			qtd_notas++;
			soma=soma+nota;
			
			if(op == 2) {
				controle=false;
			}
			
		}while(controle);
		
		System.out.println("Média: "+(soma/qtd_notas));
		
		entrada.close();		

	}

}
