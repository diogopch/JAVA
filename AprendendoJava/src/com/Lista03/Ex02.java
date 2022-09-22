package com.Lista03;
/*2. Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao
nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.*/

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		String usuario, senha;
		
		Scanner entrada = new Scanner(System.in);
		
		do {
			
			System.out.print("Informe usuário: ");
			usuario = entrada.nextLine();
			
			System.out.print("Informe a senha: ");
			senha = entrada.nextLine();
			
			if( usuario.equals( senha)) {
				System.out.println("\nA senha não pode ser igual ao usuário. \nPor favor digite novamente o usuário e uma senha diferente do usuário.");
			}
									
		}while( usuario.equals( senha ));
		
		System.out.println("\n\nSucesso");
		
		entrada.close();

	}

}
