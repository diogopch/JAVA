/*5. Faça um programa com uma função chamada somaImposto. A função possui dois
parâmetros formais: taxaImposto, que é a quantia de imposto sobre vendas expressa
em porcentagem e custo, que é o custo de um item antes do imposto. A função
“altera” o valor de custo para incluir o imposto sobre vendas.*/

package com.Lista06;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o custo: ");
		double custo = entrada.nextDouble();
		System.out.print("Informe a taxa de imposto: ");
		double tx = entrada.nextDouble();
		
		custo = somaImposto(custo, tx);
		
		System.out.println("Novo valor de custo: " + custo);
		
		entrada.close();

	}
	
	public static double somaImposto (double custo, double tx) {
		return (custo+(custo*(tx/100)));
	}
	
}
