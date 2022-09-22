package com.Lista03;
/*3. Faça um programa que leia e valide as seguintes informações:
a. Nome: maior que 3 caracteres;
b. Idade: entre 0 e 150;
c. Salário: maior que zero;
d. Sexo: 'f' ou 'm';
e. Estado Civil: 's', 'c', 'v', 'd';*/

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		double salario;
		char sexo, ev;
		
		
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.print("Informe nome: ");
			nome = entrada.nextLine();
			if( (nome.length()) <= 3) {
				System.out.println("Nome menor que 3 caracteres.\nPor favor digite um nome maior.");
			}
		}while( (nome.length()) <= 3 );
		
		do {
			System.out.print("Informe idade: ");
			idade = entrada.nextInt();
			if((idade < 0) || (idade > 150)) {
				System.out.println("Idade inválida. Digite novamente entre 0 a 150");
			}
		}while((idade < 0) || (idade > 150));
		
		do {
			System.out.print("Informe salario: ");
			salario = entrada.nextDouble();
			if(salario < 0) {
				System.out.println("Inválido. Digite novamente:");
			}
		}while(salario < 0);
		
		do {
			entrada.nextLine();
			System.out.print("Informe sexo: ");
			sexo = entrada.nextLine().charAt(0);
			System.out.println(sexo);
			if(!((sexo == 'f') || (sexo == 'm'))) {
				System.out.println("Sexo inválido.");
			}
			
		}while(!((sexo == 'f') || (sexo == 'm')));
			
		do {
			entrada.nextLine();
			System.out.println("Informe estado civil: ");
			ev = entrada.nextLine().charAt(0);
			if(!((ev == 's') || (ev == 'd') || (ev == 'c') || (ev == 'v'))) {
				System.out.println("Inválido. Digite novamente.");
			}
		}while(!((ev == 's') || (ev == 'd') || (ev == 'c') || (ev == 'v')));
			
				
		entrada.close();

	}

}
