package com.Lista03;
/*30. Uma academia deseja fazer um senso entre seus clientes para descobrir o mais alto, o
mais baixo, a mais gordo e o mais magro, para isto você deve fazer um programa que
pergunte a cada um dos clientes da academia seu código, sua altura e seu peso. O final da
digitação de dados deve ser dada quando o usuário digitar 0 (zero) no campo código. Ao
encerrar o programa também deve ser informados os códigos e valores do clente mais alto,
do mais baixo, do mais gordo e do mais magro, além da média das alturas e dos pesos dos
clientes.*/

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int cod=1, cont=0, ca=0, cb=0, cm=0, cg=0;
		double alt, peso, alto=0, baixo=0, magro=0, gordo=0, asoma=0, psoma=0;
		
		do {
			
			System.out.print("Informe o código:");
			cod = entrada.nextInt();
			
			if(cod !=0 ) {
				
				cont++;
				
				System.out.print(cont+"Peso: ");
				peso = entrada.nextDouble();
				System.out.println(cont+"Altura: ");
				alt = entrada.nextDouble();
				
				asoma=asoma+alt;
				psoma=psoma+peso;
				
				if(cont == 1) {
					alto=alt;
					baixo=alt;
					ca=cod;
					cb=cod;
				}else if(alt > alto) {
					alto=alt;
					ca=cod;
				}else if(alt < baixo) {
					baixo=alt;
					cb=cod;
				}
				
				if(cont == 1) {
					gordo=peso;
					magro=peso;
					cg=cod;
					cm=cod;
				}else if(peso > gordo) {
					gordo=peso;
					cg=cod;
				}else if(peso < magro) {
					magro=peso;
					cm=cod;
				}
				
			}
			
		}while(cod != 0);
		
		System.out.println("Magro - cod: "+cm+" Peso: "+magro);
		System.out.println("Gordo - cod: "+cg+" Peso: "+gordo);
		System.out.println("Alto - cod: "+ca+" Alt: "+alto);
		System.out.println("Baixo - cod: "+cb+" Alt: "+baixo);
		System.out.println("Media alt: "+(asoma/cont)+" Media peso: "+(psoma/cont));
		
		entrada.close();
	}

}

