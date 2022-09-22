package com.Lista03;
/*35. O cardápio de uma lanchonete é o seguinte:
• Especificação Código Preço
Cachorro Quente 100 R$ 1,20
Bauru Simples 101 R$ 1,30
Bauru com ovo 102 R$ 1,50
Hambúrguer 103 R$ 1,20
Cheeseburguer 104 R$ 1,30
Refrigerante 105 R$ 1,00

Faça um programa que leia o código dos itens pedidos e as quantidades desejadas. Calcule e
mostre o valor a ser pago por item (preço * quantidade) e o total geral do pedido. Considere
que o cliente deve informar quando o pedido deve ser encerrado.*/


import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int controle, i=0;
		int[] cod = new int[100];
		int[] qtd = new int[100];
		double[] vlr = new double[100];
		double soma=0;
		
		do {
			i=0;
			soma=0;
			do {
				i++;
				System.out.print("Informe o código: ");
				cod[i] = entrada.nextInt();
				
				if(cod[i]>=100 && cod[i]<=105) {
					
					System.out.print("Informe a qtd: ");
					qtd[i] = entrada.nextInt();
					
					if(cod[i] == 100) {
						vlr[i]=qtd[i]*1.20;					
					}else if(cod[i] == 101) {
						vlr[i]=qtd[i]*1.30;
					}else if(cod[i] == 102) {
						vlr[i]=qtd[i]*1.50;
					}else if(cod[i] == 103) {
						vlr[i]=qtd[i]*1.20;
					}else if(cod[i] == 104) {
						vlr[i]=qtd[i]*1.30;
					}else if(cod[i] == 105) {
						vlr[i]=qtd[i]*1.00;
					}
					
					soma=soma+vlr[i];
					
				}
												
			}while(cod[i]>=100 && cod[i]<=105);
			
			System.out.println("\nNF do pedido: ");
			for(int k=1; k<i; k++) {
				System.out.println("Cód: " +cod[k]+ " QTD: " +qtd[k]+ " VLR: "+vlr[k]);
			}
			System.out.println("Total a pagar: "+soma);
			
			System.out.print("\nDeseja continuar? 1 para sim, 2 para não: ");
			controle = entrada.nextInt();
		}while(controle==1);
		
		entrada.close();
	}

}

