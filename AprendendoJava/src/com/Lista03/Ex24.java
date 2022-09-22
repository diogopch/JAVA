package com.Lista03;
/*24. Faça um programa que calcule o valor total investido por um colecionador em sua
coleção de CDs e o valor médio gasto em cada um deles. O usuário deverá informar a
quantidade de CDs e o valor para em cada um.*/

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int qtd;
		double vlr, total=0;
		
		System.out.print("Informe a quantidade de cds: ");
		qtd = entrada.nextInt();
		
		for(int i=1; i<=qtd; i++) {
			
			System.out.print("Informe o valor para o cd "+i+": ");
			vlr = entrada.nextDouble();
			total=total+vlr;
		}
		
		System.out.println("Total gasto: "+total+"\nMédia: "+(total/qtd));
		
		entrada.close();
	}

}
