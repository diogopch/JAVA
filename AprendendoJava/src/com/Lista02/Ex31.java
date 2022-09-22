package com.Lista02;
/*31. O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:
Até 5 Kg Acima de 5 Kg
File Duplo R$ 4,90 por Kg R$ 5,80 por Kg
Alcatra R$ 5,90 por Kg R$ 6,80 por Kg
Picanha R$ 6,90 por Kg R$ 7,80 por Kg

Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos
de carne da promoção, porém não há limites para a quantidade de carne por
cliente. Se compra for feita no cartão Tabajara o cliente receberá ainda um
desconto de 5% sobre o total a compra. Escreva um programa que peça o tipo e
a quantidade de carne comprada pelo usuário e gere um cupom fiscal, contendo
as informações da compra: tipo e quantidade de carne, preço total, tipo de
pagamento, valor do desconto e valor a pagar.*/

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		int carne, cartao;
		double subtotal=0, qtd;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a carne desejada: 1-File / 2-Alcatra / 3-Picanha");
		carne = entrada.nextInt();
		System.out.println("Informe a qtd: ");
		qtd = entrada.nextDouble();
		System.out.println("Informe 1-cartao / 2-dinheiro: ");
		cartao = entrada.nextInt();
		if(carne==1) {
			if(qtd<5) {
				subtotal=qtd*4.9;
			}else {
				subtotal=qtd*5.8;
			}
			System.out.println("Tipo de carne: File duplo");
		}else if(carne==2) {
			if(qtd<5) {
				subtotal=qtd*5.9;
			}else {
				subtotal=qtd*6.8;
			}
			System.out.println("Tipo de carne: Alcatra");
		}else if(carne==3) {
			if(qtd<5) {
				subtotal=qtd*6.9;
			}else {
				subtotal=qtd*7.8;
			}
			System.out.println("Tipo de carne: Picanha");
		}else {
			System.out.println("Opção inválida");
		}
		System.out.println("A qtd de carne foi de: "+qtd);
		System.out.println("O subtotal: "+subtotal);
		if(cartao==1) {
			System.out.println("O valor do desconto pagando com cartão: "+(subtotal*0.05));
			System.out.println("O valor total a pagar: "+((subtotal)-(subtotal*0.05)));
		}else {
			System.out.println("O valor total a pagar: "+subtotal);
		}
		
		entrada.close();

	}

}
