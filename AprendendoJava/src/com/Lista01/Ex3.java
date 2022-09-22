package com.Lista01;
/*3. Faça um Programa que peça dois números e imprima a soma.*/
import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		int n1, n2;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o primeiro número: ");
		n1 = entrada.nextInt();
		System.out.println("Informe o segundo número: ");
		n2 = entrada.nextInt();
		System.out.println("A soma é: "+(n1+n2));
		entrada.close();
	}

}
