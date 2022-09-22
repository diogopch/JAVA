package com.Lista03;
/*33. Faça um programa que receba o valor de uma dívida e mostre uma tabela com os seguintes
dados: valor da dívida, valor dos juros, quantidade de parcelas e valor da parcela.
• Os juros e a quantidade de parcelas seguem a tabela abaixo:
Quantidade de Parcelas % de Juros sobre o valor inicial da dívida
1 0
3 10
6 15
9 20
12 25

Exemplo de saída do programa:
Valor da Dívida Valor dos Juros Quantidade de Parcelas Valor da Parcela
R$ 1.000,00 0 1 R$ 1.000,00
R$ 1.100,00 100 3 R$ 366,00
R$ 1.150,00 150 6 R$ 191,67*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex33 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0000.00");
		Scanner entrada = new Scanner(System.in);
		
		double div, tx=0, tot=0, juros=0;
		int par;
		
		System.out.print("Informe o valor da dívida: ");
		div = entrada.nextDouble();
		
		System.out.println("Vlr dívida  | Vlr Juros | QTD Parc. | Vlr Parc");
		
		for(int i=0; i<=4; i++) {
			
			if(i == 0) {
				tx=0;
				par=1;
			}else {
				par=i*3;
				if(i*3 == 3) {
				tx=10;
				}else if(i*3 == 6) {
					tx=15;
				}else if(i*3 == 9) {
					tx=20;
				}else if(i*3 == 12) {
					tx=25;
				}
			}
			
			tot=(div+(div*(tx/100)));
			juros=(div*(tx/100));
			
			System.out.println("  "+(df.format(tot))+ "       " +(df.format(juros))+ "       " +par+ "       " +(df.format(tot/par)) );
		}
		
		
		entrada.close();
	}

}
