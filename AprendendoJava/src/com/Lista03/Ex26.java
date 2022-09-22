package com.Lista03;
/*26. O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende implantar a
metodologia da tabelinha, que já é um sucesso na sua loja de 1,99. Você foi contratado para
desenvolver o programa que monta a tabela de preços de pães, de 1 até 50 pães, a partir do
preço do pão informado pelo usuário, conforme o exemplo abaixo:
• Preço do pão: R$ 0.18
Panificadora Pão de Ontem - Tabela de preços
1 - R$ 0.18
2 - R$ 0.36
...
50 - R$ 9.00*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex26 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("00.00");
		Scanner entrada = new Scanner(System.in);
		
		double preco;
		
		System.out.println("Informe o preço do pão: ");
		preco = entrada.nextDouble();
		
		for(int i=1; i<=50; i++) {
			
			System.out.println(i+" - R$ "+(df.format((i*preco))));
			
		}

		
		entrada.close();
	}

}
