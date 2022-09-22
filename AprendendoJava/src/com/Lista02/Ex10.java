package com.Lista02;
/*10.Faça um Programa que leia três números e mostre o maior e o menor deles.*/

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		int n1, n2, n3, maior=0, menor=0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe primeiro numero:");
		n1 = entrada.nextInt();
		System.out.println("Informe segundo numero:");
		n2 = entrada.nextInt();
		System.out.println("Informe terceiro numero:");
		n3 = entrada.nextInt();
		if(n1>=n2 && n1>=n3 && n2>=n3) {
			maior=n1;
			menor=n3;
		}else if(n1>=n2 && n1>=n3 && n3>=n2) {
			maior=n1;
			menor=n2;
		}else if(n2>=n1 && n2>=n3 && n1>=n3) {
			maior=n2;
			menor=n3;
		}else if(n2>=n3 && n2>=n1 && n3>=n1) {
			maior=n2;
			menor=n1;
		}else if(n3>=n1 && n3>=n2 && n1>=n2) {
			maior=n3;
			menor=n2;
		}else if(n3>=n2 && n3>=n1 && n2>=n1) {
			maior=n3;
			menor=n1;
		}else
				
		System.out.println("Maior: "+maior+" Menor: "+menor);
		
		entrada.close();

	}

}
