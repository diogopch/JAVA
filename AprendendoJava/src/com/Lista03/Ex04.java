package com.Lista03;
/*4. Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa
anual de crescimento de 3% e que a população de B seja 200000 habitantes com uma taxa de
crescimento de 1.5%. Faça um programa que calcule e escreva o número de anos necessários
para que a população do país A ultrapasse ou iguale a população do país B, mantidas as
taxas de crescimento. Altere o programa anterior permitindo ao usuário informar as
populações e as taxas de crescimento iniciais. Valide a entrada e permita repetir a
operação.*/ 


public class Ex04 {

	public static void main(String[] args) {
		
		double a=80000, b=200000;
		int ano=0;
		
		do {
			a=a+(a*0.03);
			b=b+(b*0.015);
			ano++;
		}while(a<b);
		System.out.println("Levará "+ano+" anos para a ultrapassar b.");
		System.out.println("A será de: "+a);
		System.out.println("B será de: "+b);

	}

}
