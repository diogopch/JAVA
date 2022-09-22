package com.Lista03;
/*18. Altere o programa de cálculo dos números primos, informando, caso o número não seja
primo, por quais número ele é divisível.*/

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num, cont=0;
		
		System.out.print("Informe o número para consulta se é primo: ");
		num = entrada.nextInt();
		
		for(int i=1; i<=num; i++) {
			
			if((num%i) == 0) {
				cont++;
			}
			
		}
		
		if(cont > 2) {
			System.out.println("Não é primo.\nÉ divisível po: ");
			
			for(int i=1; i<=num; i++) {
				
				if((num%i) == 0) {
					cont++;
					System.out.print(i+" - ");
				}
				
			}
			
			
		}else {
			System.out.println("É primo.");
		}
		
		
		entrada.close();

	}

}
