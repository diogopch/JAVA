/*6. Faça um programa que converta da notação de 24 horas para a notação de 12 horas.
Por exemplo, o programa deve converter 14:25 em 2:25 P.M. A entrada é dada em
dois inteiros. Deve haver pelo menos duas funções: uma para fazer a conversão e
uma para a saída. Registre a informação A.M./P.M. como um valor ‘A’ para A.M. e
‘P’ para P.M. Assim, a função para efetuar as conversões terá um parâmetro formal
para registrar se é A.M. ou P.M. Inclua um loop que permita que o usuário repita
esse cálculo para novos valores de entrada todas as vezes que desejar.*/

package com.Lista06;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int controle = 1, hora, min;
		
		while(controle != 2) {
			System.out.print("Informe a hora: ");
			hora = entrada.nextInt();
			System.out.print("Informe os minutos: ");
			min = entrada.nextInt();
			
			System.out.println("Hora convertida: ");
			System.out.println(resultadoConversao(hora, min));
						
			System.out.print("\nDeseja informar novo horário: 1 - sim | 2 - não => ");
			controle = entrada.nextInt();
		}
		
		entrada.close();
	}
	
	public static int converteHora(int x) {
		if(x > 12) {
			return(x-12);
		}else {
			return x;
		}
		
	}
	
	public static String resultadoConversao(int h, int m) {
		StringBuilder saida = new StringBuilder();
		if(h >= 12) {
			saida.append(converteHora(h));
			saida.append(" : ");
			saida.append(m);
			saida.append(" PM");
		}else {
			saida.append(h);
			saida.append(" : ");
			saida.append(m);
			saida.append(" AM");
		}
		
		return saida.toString();
	}

}
