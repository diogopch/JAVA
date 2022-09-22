package com.Lista01;
/*14.Faça um Programa que pergunte quanto você ganha por hora e o número de horas
trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se
que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o
sindicato, faça um programa que nos dê:
a. salário bruto.
b. quanto pagou ao INSS.
c. quanto pagou ao sindicato.
d. o salário líquido.
e. calcule os descontos e o salário líquido, conforme a tabela abaixo:
f. + Salário Bruto : R$
g. - IR (11%) : R$
h. - INSS (8%) : R$
i. - Sindicato ( 5%) : R$
j. = Salário Liquido : R$
Obs.: Salário Bruto - Descontos = Salário Líquido.*/

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		double ganho_hora, hora_trab, sal_bruto, ir, inss, sind, sal_liq;		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe quanto ganha por hora trabalhada: ");
		ganho_hora = entrada.nextDouble();
		System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
		hora_trab = entrada.nextDouble();
		sal_bruto=ganho_hora*hora_trab;
		ir=(sal_bruto*0.11);
		inss=sal_bruto*0.08;
		sind=(sal_bruto*0.05);
		sal_liq=(sal_bruto-ir-inss-sind);
		System.out.println("+ Salário Bruto: R$"+sal_bruto);
		System.out.println("- IR (11%) : R$ "+ir);
		System.out.println("- INSS (8%) : R$ "+inss);
		System.out.println("- Sindicato ( 5%) : R$ "+inss);
		System.out.println("= Salário Liquido : R$ "+sal_liq);
				
		entrada.close();

	}

}
