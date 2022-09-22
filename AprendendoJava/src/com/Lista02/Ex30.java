package com.Lista02;
/*30. Uma fruteira está vendendo frutas com a seguinte tabela de preços:
         Até 5 Kg       Acima de 5 Kg
Morango R$ 2,50 por Kg R$ 2,20 por Kg
Maçã R$ 1,80 por Kg R$ 1,50 por Kg

Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra
ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total.
Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a
quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo
cliente.*/

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		double morango, maca, vmo, vma, total;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a qtd em kg de morangos: ");
		morango = entrada.nextDouble();
		System.out.println("Informe a qtd em kg de maca: ");
		maca = entrada.nextDouble();
		
		if(morango<5) {
			vmo=2.50*morango;
		}else {
			vmo=2.20*morango;
		}
		if(maca<5) {
			vma=1.80*maca;
		}else {
			vma=1.50*maca;
		}
		total=vmo+vma;
		if((total>=25) || ((morango+maca)>=8)) {
			total=total-(total*0.10);
		}
		System.out.println("Total da compra é: "+total);
		
		
		entrada.close();

	}

}
