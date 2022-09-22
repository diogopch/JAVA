package com.Lista03;
/*15. Mostre e calcule a série S = (37*38)/1 + (36*37)/2 + (35*36)/3 + ... + (1*2)/37.*/


public class Ex15 {

	public static void main(String[] args) {
		
		for(int i=37; i>=1; i--) {
			
			System.out.print("(" + i + "*" + (i+1) + ")/" +  (37-(i-1)) + " + ");
			
		}

	}

}
