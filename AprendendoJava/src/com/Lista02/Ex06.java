package com.Lista02;
/*6. Faça um Programa que peça um número inteiro e se este número for par, transforme-o
em impar e vice-versa.*/

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		int num;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um número inteiro: ");
		num = entrada.nextInt();
		if((num%2)==0) {
			System.out.println("O número "+num+" é par.");
			num++;
			System.out.println(("Agora é impar: "+num));
		}else {
			System.out.println("O número "+num+" é impar.");
			num++;
			System.out.println("Agora é par: "+num);
		}
		
		entrada.close();

	}

}
