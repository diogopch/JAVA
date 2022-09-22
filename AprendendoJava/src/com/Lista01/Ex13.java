package com.Lista01;
/*13.João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o
rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o
estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar
uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa
que leia a variável peso (peso de peixes) e verifique se há excesso. Se houver, gravar na
variável excesso e na variável multa o valor da multa que João deverá pagar. Caso
contrário mostrar tais variáveis com o conteúdo ZERO OU NEGATIVO.*/

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		double peso, excesso=0, multa=0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o KG de peixes: ");
		peso = entrada.nextDouble();
		if (peso>50) {
			excesso=peso-50;
			multa=excesso*4;
		}
		System.out.println("Excesso: "+excesso+" Multa: R$ "+multa);
		
		entrada.close();
	}

}
