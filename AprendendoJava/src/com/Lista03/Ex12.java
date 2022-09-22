package com.Lista03;
/*12. A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,... Faça um
programa capaz de gerar a série até o n−ésimo termo.*/


public class Ex12 {

	public static void main(String[] args) {
		
		int num1 = 1, num2 = 0;
        
        System.out.print(num2+" - ");
        System.out.print(num1+" - ");
        
        for(int i = 0; i < 8; i++){
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.print(num1+" - ");
        }
			

	}

}
