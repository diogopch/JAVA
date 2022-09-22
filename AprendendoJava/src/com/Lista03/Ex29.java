package com.Lista03;
/*29. Desenvolva um programa que faça a tabuada de um número qualquer inteiro que será
digitado pelo usuário, mas a tabuada não deve necessariamente iniciar em 1 e terminar em
10, o valor inicial e final devem ser informados também pelo usuário, conforme exemplo
abaixo:
• Montar a tabuada de: 5
Começar por: 4
Terminar em: 7
Vou montar a tabuada de 5 começando em 4 e terminando em 7:
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35

Obs: Você deve verificar se o usuário não digitou o final menor que o inicial.*/

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num, inicio, fim, aux;
		
		System.out.print("Informe o número: ");
		num = entrada.nextInt();
		System.out.print("Informe o inicio: ");
		inicio = entrada.nextInt();
		System.out.print("Informe o fim: ");
		fim = entrada.nextInt();
		
		if(inicio > fim) {
			aux=fim;
			fim=inicio;
			inicio=aux;
		}
		
		for(int i=inicio; i<=fim; i++) {
			
			System.out.println(i+" X "+num+" = "+(i*num));
			
		}
		
		entrada.close();
	}

}

