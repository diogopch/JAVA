package com.Lista02;
/*18.Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se
os valores podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo
é: equilátero, isósceles ou escaleno.
Dicas:
Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o
terceiro;
Triângulo Equilátero: três lados iguais;
Triângulo Isósceles: quaisquer dois lados iguais;
Triângulo Escaleno: três lados diferentes;*/

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		float l1, l2, l3;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe lado 1: ");
		l1 = entrada.nextFloat();
		System.out.println("Informe lado 2: ");
		l2 = entrada.nextFloat();
		System.out.println("Informe lado 3: ");
		l3 = entrada.nextFloat();
		if ((l1 + l2 < l3) || (l1 + l3 < l2) || (l2 + l3 < l1)) {
            System.out.println("Não é um Triangulo");
        } else if ((l1 == l2) && (l1 == l3)) {
            System.out.println("Equilatero");
        } else if ((l1 == l2) || (l1 == l3) || (l2 == l3)) {
            System.out.println("Isósceles");
        } else {
            System.out.println("Escaleno");
        }
		
		
		entrada.close();

	}

}
