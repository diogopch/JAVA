package com.Lista02;
/*12.As Organizações Tabajara resolveram dar um aumento de salário aos seus
colaboradores e lhe contrataram para desenvolver o programa que calculará os
reajustes.
o Faça um programa que recebe o salário de um colaborador e calcule o reajuste
segundo o seguinte critério, baseado no salário atual:
o salários até R$ 280,00 (incluindo) : aumento de 20%
o salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
o salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser
realizado, informe na tela:
o o salário antes do reajuste;
o o percentual de aumento aplicado;
o o valor do aumento;
o o novo salário, após o aumento.*/

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		double sal, nsal;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o salário atual: ");
		sal = entrada.nextDouble();
		if(sal<=280) {
			nsal=sal+(sal*0.20);
			System.out.println("Salário antes do reajuste: "+sal);
			System.out.println("Percentual de aumento aplicado: 20%");
			System.out.println("Valor do aumento: R$ "+(sal*0.20));
			System.out.println("Salário após reajuste: R$ "+nsal);
		}else if(sal>280 && sal<=700) {
			nsal=sal+(sal*0.15);
			System.out.println("Salário antes do reajuste: "+sal);
			System.out.println("Percentual de aumento aplicado: 15%");
			System.out.println("Valor do aumento: R$ "+(sal*0.15));
			System.out.println("Salário após reajuste: R$ "+nsal);
		}else if(sal>700 && sal<=1500) {
			nsal=sal+(sal*0.10);
			System.out.println("Salário antes do reajuste: "+sal);
			System.out.println("Percentual de aumento aplicado: 10%");
			System.out.println("Valor do aumento: R$ "+(sal*0.10));
			System.out.println("Salário após reajuste: R$ "+nsal);
		}else if(sal>1500) {
			nsal=sal+(sal*0.05);
			System.out.println("Salário antes do reajuste: "+sal);
			System.out.println("Percentual de aumento aplicado: 5%");
			System.out.println("Valor do aumento: R$ "+(sal*0.05));
			System.out.println("Salário após reajuste: R$ "+nsal);
		}
		
		entrada.close();

	}

}
