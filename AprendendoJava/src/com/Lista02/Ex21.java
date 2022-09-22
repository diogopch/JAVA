package com.Lista02;
/*21. Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma
é uma data válida.*/

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		int dia, mes, ano;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o dia: ");
		dia = entrada.nextInt();
		System.out.println("Informe o mes: ");
		mes = entrada.nextInt();
		System.out.println("Informe o ano: ");
		ano = entrada.nextInt();
		if(ano>=0) {
			if(dia>0 && dia<=31) {
				if(mes>0 && mes<=12) {
					switch(mes) {
					case 1 :
					case 3 :
					case 5 :
					case 7 :
					case 8 :
					case 10 :
					case 12 :
						if (dia>0 && dia<=31) {
							System.out.println(dia+"/"+mes+"/"+ano);
						}
					break;
					case 2 :
						if ((ano%4)==0) {
							if (dia>0 && dia<=29) {
								System.out.println(dia+"/"+mes+"/"+ano);
							}
						}else if (dia>0 && dia<=28) {
							System.out.println(dia+"/"+mes+"/"+ano);
						}
					break;
					case 4 :
					case 6 :
					case 9 :
					case 11 :
						if (dia>0 && dia<=30) {
							System.out.println(dia+"/"+mes+"/"+ano);
						}
					break;
					default :
						System.out.println("Data inválida");
					break;
					}
				}else {
					System.out.println("Data Inválida");
				}
			}
		}		
		entrada.close();

	}

}
