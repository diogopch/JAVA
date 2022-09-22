package com.Lista03;
/*14. Faça um programa que mostre os n termos da Série a seguir:
• S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m.*/ 


public class Ex14 {

	public static void main(String[] args) {
		
				
		for(int i=1; i<20; i++) {
					
			System.out.print(i + "/" + (i+i-1) + " + ");
			
		}

	}

}
