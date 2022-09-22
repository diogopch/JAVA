package com.Lista01;
/*8. Faça um Programa que pergunte quanto você ganha por hora e o número de horas
trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.*/

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		float ganho_hora, hora_trab, sal;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe quanto ganha por hora trabalhada: ");
		ganho_hora = entrada.nextFloat();
		System.out.println("Informe as horas trabalhadas no mês: ");
		hora_trab = entrada.nextFloat();
		sal=ganho_hora*hora_trab;
		System.out.println("O salário é: "+sal);
		
		entrada.close();

	}

}
