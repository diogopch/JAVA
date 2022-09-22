package com.Lista02;
/*13.Faça um programa para o cálculo de uma folha de pagamento, sabendo que os
descontos são do Imposto de Renda, que depende do salário bruto (conforme tabela
abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas
não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao
Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua
hora e a quantidade de horas trabalhadas no mês.
Desconto do IR:
Salário Bruto até 900 (inclusive) - isento
Salário Bruto até 1500 (inclusive) - desconto de 5%
Salário Bruto até 2500 (inclusive) - desconto de 10%
Salário Bruto acima de 2500 - desconto de 20% 
Imprima na tela as informações, dispostas
conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.
Salário Bruto: (5 * 220) : R$ 1100,00
(-) IR (5%) : R$ 55,00
(-) INSS ( 10%) : R$ 110,00
FGTS (11%) : R$ 121,00
Total de descontos : R$ 165,00
Salário Liquido : R$ 935,00*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex13 {

	public static void main(String[] args) {
		double hora, qtdh, bruto, liq, ir=0, inss, sind;
		Scanner entrada = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###.00");
		System.out.println("Informe o valor da hora trabalhada: ");
		hora = entrada.nextDouble();
		System.out.println("Informe a qtd de horas trabalhadas no mes: ");
		qtdh = entrada.nextDouble();
		bruto=hora*qtdh;
		System.out.println("+ Salário Bruto: R$ "+df.format(bruto));
		if(bruto<=900) {
			ir=0;
			System.out.println("(-) IR (0%): R$"+df.format(ir));
		}else if(bruto>900 && bruto<=1500){
			ir=bruto*0.05;
			System.out.println("(-) IR (5%): R$"+df.format(ir));
		}else if(bruto>1500 && bruto<=2500) {
			ir=bruto*0.10;
			System.out.println("(-) IR (10%): R$"+df.format(ir));
		}else if(bruto>2500) {
			ir=bruto*0.20;
			System.out.println("(-) IR (20%): R$"+df.format(ir));
		}
		inss=bruto*0.10;
		sind=bruto*0.03;
		System.out.println("(-) INSS: R$ "+df.format(inss));
		System.out.println("FGTS: R$ "+df.format(bruto*0.11));
		System.out.println("(-) Sindicato: R$ "+df.format(sind));
		System.out.println("Total de descontos: R$"+df.format(ir+inss+sind));
		liq=bruto-ir-inss-sind;
		System.out.println("Salário Liquido: R$ "+df.format(liq));
		entrada.close();
	}

}
