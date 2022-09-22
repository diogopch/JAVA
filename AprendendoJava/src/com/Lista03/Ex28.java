package com.Lista03;
/*28. O Departamento Estadual de Meteorologia lhe contratou para desenvolver um programa
que leia as um conjunto indeterminado de temperaturas, e informe ao final a menor e a
maior temperaturas informadas, bem como a média das temperaturas.*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex28 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("00.00");
		Scanner entrada = new Scanner(System.in);
		
		int cont=0, op;
		double temp, maior=0, menor=0, soma=0;
		
		do {
			
			cont++;
			System.out.print("Informe a "+cont+" ª temperatura: ");
			temp = entrada.nextDouble();
			
			soma=soma+temp;
			
			if(cont == 1) {
				maior=temp;
				menor=temp;
			}else if(temp > maior) {
				maior=temp;
			}else if(temp < menor) {
				menor=temp;
			}
			
			System.out.print("Continuar? 1 - SIM | 2 - NÃO");
			op = entrada.nextInt();
			
		}while(op == 1);
		
		System.out.println("Maior temperatura: "+maior+"\nMenor temperatura: "+menor);
		System.out.println("Média: "+(df.format(soma/cont)));
		
		entrada.close();
	}

}
