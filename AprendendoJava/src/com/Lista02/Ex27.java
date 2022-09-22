package com.Lista02;
/*27. Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação
ele deseja realizar. O resultado da operação deve ser acompanhado de uma frase que diga
se o número é:

o par ou ímpar;
o positivo ou negativo;
o inteiro ou decimal.*/

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		float n1, n2, res=0;
		int op;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um número 1: ");
		n1 = entrada.nextFloat();
		System.out.println("Informe um número 2: ");
		n2 = entrada.nextFloat();
		System.out.println("Informe uma opção: 1 soma | 2 subtrair | 3 produto | 4 divisão : ");
		op = entrada.nextInt();
		switch(op){
		case 1:
			res=n1+n2;
		break;
		case 2:
			res=n1-n2;
		break;
		case 3:
			res=n1*n2;
		break;
		case 4:
			res=n1/n2;
		break;
		default:
			System.out.println("Inválido");
		break;
		}
		System.out.println("A resposta é: "+res);
		if((res%2)==0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
		if(res>0) {
			System.out.println("Positivo");
		}else {
			System.out.println("Negativo");
		}
		if(res%1==0) {
			System.out.println("INTEIRO");
		}else {
			System.out.println("DECIMAL");
		}
		
		entrada.close();
	}

}
