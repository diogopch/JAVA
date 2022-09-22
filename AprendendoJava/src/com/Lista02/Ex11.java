package com.Lista02;
/*11.Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-
Matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", 
"Boa Tarde!" ou "Boa Noite!" , conforme o caso.*/

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		char turno;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o turno: ");
		turno = entrada.nextLine().charAt(0);
		switch (turno) {
		case 'm':
			System.out.println("Bom dia!");
		break;
		case 'v':
			System.out.println("Boa tarde!");
		break;
		case 'n':
			System.out.println("Boa noite!");
		break;
		default:
			System.out.println("Inválido..");
		}
		
		entrada.close();
		
	}

}
