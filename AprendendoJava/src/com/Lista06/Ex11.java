/*11. Data com mês por extenso. Construa uma função que receba uma data no formato
DD/MM/AAAA e devolva uma string no formato D de mesPorExtenso de AAAA.
Opcionalmente, valide a data e retorne NULL caso a data seja inválida.*/

package com.Lista06;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[] data = informaData();
		
		System.out.println(dataExtenso(data));
		
		
		entrada.close();
	}
	
	public static int[] informaData () {
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
				
			}else if ( (dia < 1) || (dia > 30) && (((mes == 4)) || (mes == 6) || (mes == 9) || (mes == 11))) {
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
		
						
		entrada.close();
		
		return vet;
	}
	
	public static String dataExtenso(int[] date) {
		StringBuilder saida = new StringBuilder();
		saida.append(date[0]);
		saida.append(" de ");
		saida.append(mesExtenso(date[1]));
		saida.append(" de ");
		saida.append(date[2]);
		return saida.toString();
	}
	
	public static String mesExtenso(int m) {
		switch(m) {
			case 1 : return "janeiro";
			case 2 : return "fevereiro";
			case 3 : return "março";
			case 4 : return "abril";
			case 5 : return "maio";
			case 6 : return "junho";
			case 7 : return "julho";
			case 8 : return "agosto";
			case 9 : return "setembro";
			case 10 : return "outubro";
			case 11 : return "novembro";
			case 12 : return "dezembro";
			default : return " ";
		}
	}

}