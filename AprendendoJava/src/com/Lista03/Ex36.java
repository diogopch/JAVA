package com.Lista03;
/*36. Em uma eleição presidencial existem quatro candidatos. Os votos são informados por
meio de código. Os códigos utilizados são:
• 1 , 2, 3, 4 - Votos para os respectivos candidatos
(você deve montar a tabela ex: 1  Jose/ 2- João/etc)
5  Voto Nulo
6  Voto em Branco

Faça um programa que calcule e mostre:
• O total de votos para cada candidato;
• O total de votos nulos;
• O total de votos em branco;
• A percentagem de votos nulos sobre o total de votos;
• A percentagem de votos em branco sobre o total de votos. Para finalizar o conjunto de votos
tem-se o valor zero.*/

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int c1=0, c2=0, c3=0, c4=0, b=0, n=0, voto=-1, cont_total=0;
		
		do {
			
			System.out.println("Informe o voto:\n1 = Candidato 1\n2 = Candidato 2\n3 = Candidato 3");
			System.out.print("4 = Candidato 4\n5 = 5 = Nulo \n6 = Branco\n0 = Sair     => ");
			voto = entrada.nextInt();
			
			if(voto != 0) {
				
				cont_total++;
				
				if(voto == 1) {
					c1++;
				}else if(voto == 2) {
					c2++;
				}else if(voto == 3) {
					c3++;
				}else if(voto == 4) {
					c4++;
				}else if(voto == 5) {
					b++;
				}else if(voto == 6) {
					n++;
				}
				
			}
						
		}while(voto != 0);
		
		System.out.println("Candidato 1 = "+c1);
		System.out.println("Candidato 2 = "+c2);
		System.out.println("Candidato 3 = "+c3);
		System.out.println("Candidato 4 = "+c4);
		System.out.println("Brancos = "+b);
		System.out.println("Nulos = "+n);
		System.out.println("Porcentagem brancos sobre total: "+((b*100)/cont_total)+"%");
		System.out.println("Porcentagem nulos sobre total: "+((n*100)/cont_total)+"%");
		
		entrada.close();
	}

}
