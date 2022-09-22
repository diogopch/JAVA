package com.Lista03;
/*21. Faça um programa que peça para n pessoas a sua idade, ao final o programa devera
verificar se a média de idade da turma varia entre 0 e 25,26 e 60 e maior que 60; e então,
dizer se a turma é jovem, adulta ou idosa, conforme a média calculada.*/

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int op, cont=0, idade, soma=0;
		double md;
		boolean controle=true;
		
		do {
			
			cont++;
			System.out.println("Informe a "+cont+"ª idade: ");
			idade = entrada.nextInt();
			
			soma=soma+idade;
			
			System.out.print("Deseja informar mais uma idade - 1 SIM | - 2 NÃO: ");
			op = entrada.nextInt();
			if(op == 2) {
				controle=false;
			}
			
		}while(controle);
		
		md=soma/cont;
		
		System.out.println("Media: "+md);
		
		if((md>=0) && (md<26)) {
			System.out.println("Turma jovem.");
		}else if((md>=26) && (md<60)) {
			System.out.println("Turma adulta.");
		}else {
			System.out.println("Turma idosa.");
		}
			
		entrada.close();
	}

}
