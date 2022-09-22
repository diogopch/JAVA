package com.Lista02;
/*29. Um posto está vendendo combustíveis com a seguinte tabela de descontos:
Álcool:
até 20 litros, desconto de 3% por litro
acima de 20 litros, desconto de 5% por litro
Gasolina:
até 20 litros, desconto de 4% por litro
acima de 20 litros, desconto de 6% por litro
Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado
da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente
sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.*/

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		char op;
		double litros, valor;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o combustivel desejado: a-álcool, g-gasolina: ");
		op = entrada.nextLine().charAt(0);
		System.out.println("Informe a qtd de litros: ");
		litros = entrada.nextDouble();
		if(op=='a') {
			if(litros<20) {
				valor=(litros*1.90)-((litros*1.90)*0.03);
			}else {
				valor=(litros*1.90)-((litros*1.90)*0.05);
			}
			System.out.println("Valor total: R$ "+valor);
		}
		if(op=='g') {
			if(litros<20) {
				valor=(litros*2.50)-((litros*2.50)*0.04);
			}else {
				valor=(litros*2.50)-((litros*2.50)*0.06);
			}
			System.out.println("Valor total: R$ "+valor);
		}
		entrada.close();

	}

}
