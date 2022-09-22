/*7. Faça um programa que use a função valorPagamento para determinar o valor a ser
pago por uma prestação de uma conta. O programa deverá solicitar ao usuário o
valor da prestação e o número de dias em atraso e passar estes valores para a função
valorPagamento, que calculará o valor a ser pago e devolverá este valor ao
programa que a chamou. O programa deverá então exibir o valor a ser pago na tela.
Após a execução o programa deverá voltar a pedir outro valor de prestação e assim
continuar até que seja informado um valor igual a zero para a prestação.
Neste momento o programa deverá ser encerrado, exibindo o relatório do dia, que conterá
a quantidade e o valor total de prestações pagas no dia. O cálculo do valor a ser
pago é feito da seguinte forma. Para pagamentos sem atraso, cobrar o valor da
prestação. Quando houver atraso, cobrar 3% de multa, mais 0,1% de juros por dia
de atraso.*/

package com.Lista06;

import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class Ex07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<Double> relatorio = new ArrayList<Double>();
		DecimalFormat df = new DecimalFormat("#,##0.00");
		
		double prestacao, soma=0;
		
		do {
		
			System.out.print("Informe o valor da prestação: ");
			prestacao = entrada.nextDouble();
			
			if(prestacao != 0) {
			
				System.out.print("Informe os dias em atraso: ");
				int dia = entrada.nextInt();
				
				double valor = valorPagamento(prestacao, dia);
				relatorio.add(valor);
				System.out.println("Valor a ser pago: " + df.format(valor));
			
			}
		}while(prestacao != 0);
		
		System.out.println("\n ***** RELATÓRIO DO DIA *****");
		for(int i = 0; i < relatorio.size(); i++) {
			System.out.println("R$ " + df.format(relatorio.get(i)));
			soma = soma + relatorio.get(i);
		}
		System.out.println("Totaldo dia: R$ " + df.format(soma));
		
		entrada.close();
	}
	
	public static double valorPagamento(double prest, int d) {
		if (d > 0) {
			return( (prest + (prest * 0.03)) + (prest * ((d*0.1)/100)) );
		}else {
			return(prest);
		}
	}

}
