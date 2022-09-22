package com.Lista03;
/*27. O Sr. Manoel Joaquim expandiu seus negócios para além dos negócios de 1,99 e agora
possui uma loja de conveniências. Faça um programa que implemente uma caixa
registradora rudimentar. O programa deverá receber um número desconhecido de valores
referentes aos preços das mercadorias. Um valor zero deve ser informado pelo operador para
indicar o final da compra. O programa deve então mostrar o total da compra e perguntar o
valor em dinheiro que o cliente forneceu, para então calcular e mostrar o valor do troco.
Após esta operação, o programa deverá voltar ao ponto inicial, para registrar a próxima
compra. A saída deve ser conforme o exemplo abaixo:

• Lojas Tabajara
Produto 1: R$ 2.20
Produto 2: R$ 5.80
Produto 3: R$ 0
Total: R$ 9.00
Dinheiro: R$ 20.00
Troco: R$ 11.00*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex27 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("##0.00");
		Scanner entrada = new Scanner(System.in);
		
		boolean controle=true;
		int cont, op;
		double valor, soma, dinheiro;
				
		while(controle) {
			
			cont=0;
			soma=0;
			System.out.println("Lojas Tabajara");
			do {
				cont++;
				System.out.print("Produto "+cont+": R$ ");
				valor = entrada.nextDouble();
				soma=soma+valor;
			}while(valor != 0);
			System.out.println("Total: R$ "+(df.format(soma)));	
			System.out.print("Dinheiro: R$ ");
			dinheiro = entrada.nextDouble();
			System.out.println("Troco: R$ "+(df.format((dinheiro-soma))));
			
			System.out.print("\nDeseja continuar: 1 sim ou 2 não..");
			op = entrada.nextInt();
			if(op != 1) {
				controle=false;
			}
			
		}
		
		entrada.close();
	}

}

