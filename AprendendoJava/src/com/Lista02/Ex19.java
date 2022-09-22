package com.Lista02;
/*19. Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2
+ bx + c. O programa deverá pe seguintes situações:
Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o
programa não deve fazer pedir os demais valores, sendo encerrado;
Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e
encerre o programa;
Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao
usuário;
Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;*/

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		float a, b, c;
		double x1, x2, delta;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o valor de a: ");
		a = entrada.nextFloat();
		System.out.println("Informe o valor de b: ");
		b = entrada.nextFloat();
		System.out.println("Informe o valor de c: ");
		c = entrada.nextFloat();
		delta=((b*b)-4*a*c);
		if(a==0) {
			System.out.println("Equação não é do Segundo grau.");
		}else if(delta<0) {
			System.out.println("A equação não possui raízes reais");
		}else if(delta==0) {
			System.out.println("A equação possui apenas uma raíz: "+(-b/(2*a)));
		}else {
			x1=(-b+ Math.sqrt(delta)) / (2*a);
			x2=(-b- Math.sqrt(delta)) / (2*a);
			System.out.println("As raízes são x': "+x1+" x'': "+x2);
		}
		
		entrada.close();
		
	}

}
