package com.Lista03;
/*4. Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa
anual de crescimento de 3% e que a população de B seja 200000 habitantes com uma taxa de
crescimento de 1.5%. Faça um programa que calcule e escreva o número de anos necessários
para que a população do país A ultrapasse ou iguale a população do país B, mantidas as
taxas de crescimento. Altere o programa anterior permitindo ao usuário informar as
populações e as taxas de crescimento iniciais. Valide a entrada e permita repetir a
operação.*/ 

import java.util.Scanner;

public class Ex04b {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double a, b, txa, txb;
		int ano=0, op;
		boolean controle=true;
		
		
		do {
			
			System.out.println("Informe a população de A: ");
			a = entrada.nextDouble();
			System.out.println("Informe a taxa de crescimento de A: ");
			txa = entrada.nextDouble();
			System.out.println("Informe a população de B: ");
			b = entrada.nextDouble();
			System.out.println("Informe a taxa de crescimento de B: ");
			txb = entrada.nextDouble();
			
			ano=0;
			if(a < b) {
				
				do {
					a=a+(a*(txa/100));
					b=b+(b*(txb/100));
					ano++;
				}while(a<b);
				System.out.println("Levará "+ano+" anos para a ultrapassar b.");
				System.out.println("A será de: "+a);
				System.out.println("B será de: "+b);
				
			}else if(a == b) {
				System.out.println("A população já é igual...");
			}else {
				
				do {
					a=a+(a*(txa/100));
					b=b+(b*(txb/100));
					ano++;
				}while(b<a);
				System.out.println("Levará "+ano+" anos para b ultrapassar a.");
				System.out.println("A será de: "+a);
				System.out.println("B será de: "+b);
				
			}
			
			System.out.println("Deseja continuar? 1 para sim ou 2 para não.");
			op = entrada.nextInt();
			
			if(op == 2) {
				controle=false;
			}
			
			
		}while(controle);
		
		
		entrada.close();

	}

}