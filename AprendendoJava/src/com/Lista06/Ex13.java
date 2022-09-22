/*13. Desenha moldura. Construa uma função que desenhe um retângulo usando os
caracteres ‘+’ , ‘−’ e ‘| ‘. Esta função deve receber dois parâmetros, linhas e colunas,
sendo que o valor por omissão é o valor mínimo igual a 1 e o valor máximo é 20. Se
valores fora da faixa forem informados, eles devem ser modificados para valores
dentro da faixa de forma elegante.
+-----+*/

package com.Lista06;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int linha, coluna;
		
		System.out.print("Informe Linha: ");
		linha = entrada.nextInt();
		System.out.print("Informe Coluna: ");
		coluna = entrada.nextInt();
		
		if(linha < 1 || linha > 20) {
			linha = 5;
		}
		if(coluna < 1 || coluna > 20) {
			coluna = 5;
		}
		
		String resultado = desenhaMoldura(linha, coluna);
		
		System.out.println(resultado);
		
		entrada.close();
	}
	
	public static String desenhaMoldura(int l, int c) {
		StringBuilder s = new StringBuilder();
		
		for(int i = 0; i < l; i++) {
			for(int j = 0; j < c; j++) {
				if(i == 0 && j == 0) {
					s.append("+");
				}else if(i == 0 && j == c-1) {
					s.append("+");
				}else if(i == l-1 && j == 0) {
					s.append("\n+");
				}else if(i == l-1 && j == c-1) {
					s.append("+");
				}else if(i == 0) {
					s.append("-");
				}else if(i == l-1) {
					s.append("-");
				}else if(j == 0) {
					s.append("\n|");
				}else if(j == c-1) {
					s.append("|");
				}else {
					s.append(" ");
				}
			}
		}
		//saida.append(v[i]);
		
		return s.toString();
	}

}