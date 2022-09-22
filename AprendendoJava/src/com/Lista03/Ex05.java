package com.Lista03;
/*5. Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro. Depois
modifique o programa para que ele mostre os números um ao lado do outro.*/

public class Ex05 {

	public static void main(String[] args) {
		System.out.println("Um abaixo do outro: ");
		
		for( int i=1; i<=20; i++) {
			System.out.println(i);
		}
		
		System.out.println("\n\n Um ao lado do outro: ");
		
		for( int i=1; i<=20; i++) {
			System.out.print(i+" - ");
		}

	}

}
