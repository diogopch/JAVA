package com.Lista02;
/*7. Faça um Programa que leia três números e mostre-os em ordem decrescente.*/

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		int n1, n2, n3;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o primeiro número");
		n1 = entrada.nextInt();
		System.out.println("Informe o segundo número");
		n2 = entrada.nextInt();
		System.out.println("Informe o terceiro número");
		n3 = entrada.nextInt();
		if(n1>=n2 && n1>=n3 && n2>=n3) {
			System.out.println(n3+" "+n2+" "+n1);
		}else if(n1>=n3 && n1>=n2 && n3>=n2) {
			System.out.println(n2+" "+n3+" "+n1);
		}else if(n2>=n1 && n2>=n3 && n1>=n3) {
			System.out.println(n3+" "+n1+" "+n2);
		}else if(n2>=n3 && n2>=n1 && n3>=n1) {
			System.out.println(n1+" "+n3+" "+n2);
		}else if(n3>=n1 && n3>=n2 && n1>=n2) {
			System.out.println(n2+" "+n1+" "+n3);
		}else if(n3>=n2 && n3>=n1 && n2>=n1) {
			System.out.println(n1+" "+n2+" "+n3);
		}
		
		entrada.close();
		
	}

}
